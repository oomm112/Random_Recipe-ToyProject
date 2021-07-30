package com.home.recipe;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONValue;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class RecipeApiService {
	public List<Map<String, Object>> callRecipe(HashMap<String, String> hMap) throws Exception{
		JSONArray bodyArray = new JSONArray();
		
		URL url = new URL("http://211.237.50.150:7080/openapi"
				+ "/6656c9e650895c5ab998b2492c0396fbf3259ed991c4d0eaf09bc034466e0739"
				+ "/json"
				+ "/Grid_20150827000000000226_1/1/5");
		
		InputStreamReader is = new InputStreamReader(url.openConnection().getInputStream(), "UTF-8");
		
		JSONObject jsonObject = (JSONObject)JSONValue.parseWithException(is);
		
		bodyArray = (JSONArray)jsonObject.get("Grid_20150827000000000226_1");
		System.out.println(bodyArray);
		return bodyArray;
		/*
		 * try { url = new URL("http://211.237.50.150:7080/openapi" +
		 * "/6656c9e650895c5ab998b2492c0396fbf3259ed991c4d0eaf09bc034466e0739" + "/json"
		 * + "/Grid_20150827000000000226_1/1/5"); HttpURLConnection urlConnection =
		 * (HttpURLConnection) url.openConnection();
		 * 
		 * RecipeVO recipeVO = new RecipeVO();
		 * 
		 * recipeVO.setRECIPE_NM_KO(list.get("RECIPE_NM_KO"));
		 * System.out.println("레시피이름"+recipeVO.getRECIPE_NM_KO());
		 * model.addAttribute("recipe_list", recipe_list); } catch (Exception e) { //
		 * TODO Auto-generated catch block e.printStackTrace(); } return list;
		 */
	}
}
