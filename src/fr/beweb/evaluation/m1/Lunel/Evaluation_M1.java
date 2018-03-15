/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.beweb.evaluation.m1.Lunel;

import bwb_evaluation_algo.library.CoreEvaluation;
import bwb_evaluation_algo.library.EvaluationSystem;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cedriclavery
 */
public class Evaluation_M1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        
        /**
        CoreEvaluation eval = EvaluationSystem.getEvaluation();
        eval.addQuestionnaire("");
        eval.addDestination("");
        //création des balises
        Tag root = new Tag("html");
        Tag head = new Tag("head");
        Tag body = new Tag("body");
        //style doit être dans le même dossier que index.html
        head.addStylesheet("style.css");
        //insertion de la balise head dans la balise html
        head.insertInto(root);
        //insertion de la balise body dans la balise html
        body.insertInto(root);
        //insertion d'une div dans la balise body
        Tag a = new Tag("div");
        a.insertInto(body);
        
        
        List<String> questions = new ArrayList<>();
        * while ((line = eval.readLine()) != null){
        questions.add("");
        String message = "#";
        char c = message.charAt(0);
        String line;
        * }
        * reader.close();
        */
        EvaluationSystem.getAutorun().launch("/home/cedriclavery/programmes/Evaluation_M1/eval/questionnaire.txt","/home/cedriclavery/ServeurWeb/index.html");
    }
    
}
