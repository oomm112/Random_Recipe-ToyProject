package com.home.recipe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RecipeApi{

	/*
	 * @RequestMapping("/main") public String getRecipe() { StringBuffer result =
	 * new StringBuffer(); String urlstr =
	 * "http://211.237.50.150:7080/openapi/sample/xml/Grid_20150827000000000227_1/1/5/"
	 * +
	 * "API_KEY = 6656c9e650895c5ab998b2492c0396fbf3259ed991c4d0eaf09bc034466e0739/"
	 * + "TYPE = xml"; URL url; try { url = new URL(urlstr); HttpURLConnection
	 * urlConnection = (HttpURLConnection) url.openConnection();
	 * 
	 * 
	 * BufferedReader br = new BufferedReader(new
	 * InputStreamReader(urlConnection.getInputStream(), "UTF-8"));
	 * 
	 * String returnLine; result.append("<xmp>"); while ((returnLine =
	 * br.readLine()) != null) { result.append(returnLine + "\n");
	 * urlConnection.disconnect(); } } catch (MalformedURLException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); }catch (ProtocolException e)
	 * { // TODO Auto-generated catch block e.printStackTrace(); } catch
	 * (IOException e) { // TODO Auto-generated catch block e.printStackTrace(); }
	 * return result+"</xmp>"; }
	 */
}
