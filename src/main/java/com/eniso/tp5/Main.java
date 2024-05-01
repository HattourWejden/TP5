/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5;

/**
 *
 * @author Hatto
 */
public class Main {
    public static void main(String[] args) {
ClassificationDataset classificationData = new ClassificationDataset("chemin/vers/classification_data.csv", true);
RegressionDataset regressionData = new RegressionDataset("chemin/vers/regression_data.csv", false);

SupportVectorMachine svm = new SupportVectorMachine("string",3,2, 1, "string", "cpu");
svm.train(classificationData);
svm.displayDetails();
RandomForest rf = new RandomForest("RandomForest", 100,1,"string", 10,"string");
rf.train(regressionData);
rf.displayDetails();
NeuralNetwork nn = new NeuralNetwork("NeuralNetwork", 2, "2","d", new int[]{10, 5, 1},"string" );
nn.train(classificationData);
nn.displayDetails();
System.out.println("Prédiction SVM : " + svm.predict(classificationData));
System.out.println("Prédiction RandomForest : " + rf.predict(regressionData));
System.out.println("Prédiction NeuralNetwork : " + nn.predict(classificationData));
}
    
}
