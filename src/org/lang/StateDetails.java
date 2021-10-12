package org.lang;

public class StateDetails {
private void southIndia() {
System.out.println("Tamil Nadu,Kerala,Karnataka,Andhra");
}
private void northIndia() {
	System.out.println("Delhi,Punjab, Gujarat,Rajasthan");

}
public static void main(String[] args) {
StateDetails c= new StateDetails();
c.southIndia();
c.northIndia();
LanguageInfo e=new LanguageInfo();
e.tamilLanguage();
e.englishLanguage();
e.hindiLanguage();
}

}
