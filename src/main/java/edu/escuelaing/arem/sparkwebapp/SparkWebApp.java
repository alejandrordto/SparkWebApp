/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.sparkwebapp;

import static spark.Spark.*;
/**
 *
 * @author 2112107
 */
public class SparkWebApp {
    public static void main(String[] args) {
    get("/hello", (req, res) -> "Hello Heroku");
 }
   
 static int getPort() {
 if (System.getenv("PORT") != null) {
 return Integer.parseInt(System.getenv("PORT"));
 } else
 return 4567; //returns default port if heroku-port isn't set (i.e. on localhost)
 }
}
