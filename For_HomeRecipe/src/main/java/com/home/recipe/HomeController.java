package com.home.recipe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate );

		return "main";
	}

	@RequestMapping(value = {"/","/main"})
	@ResponseBody
	public ModelAndView getRecipe(HttpServletRequest req, HttpServletResponse res) throws Exception {	

		URL url = new URL("http://211.237.50.150:7080/openapi"
				+ "/6656c9e650895c5ab998b2492c0396fbf3259ed991c4d0eaf09bc034466e0739"
				+ "/json"
				+ "/Grid_20150827000000000226_1/1/1000");

		BufferedReader br = new BufferedReader(new InputStreamReader(url.openConnection().getInputStream(), "UTF-8"));

		String line = br.readLine().toString();

		GsonBuilder builder = new GsonBuilder();
		builder.setPrettyPrinting();
		Gson gson = builder.create();

		JSONObject jsonObj = new JSONObject(line);
		JSONObject jsont = jsonObj.getJSONObject("Grid_20150827000000000226_1");

		JSONArray jsonArr = jsont.getJSONArray("row");
		
		List<RecipeVO> recipe_list = new ArrayList<RecipeVO>();
		for (int i = 0; i < jsonArr.length(); i++) { 
			JSONObject obj = jsonArr.getJSONObject(i);
			RecipeVO recipeVO = new RecipeVO();
			recipeVO.setRECIPE_NM_KO(obj.getString("RECIPE_NM_KO"));
			recipeVO.setLEVEL_NM(obj.getString("LEVEL_NM"));
			recipeVO.setNATION_NM(obj.getString("NATION_NM"));
			recipe_list.add(i,recipeVO);
		}
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/main");
		mv.addObject("list", recipe_list);
		return mv;
	} 

}
