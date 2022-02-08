package com.company;

import java.sql.SQLOutput;

public class Main {

 public static void main(String[] args) {
  Ui ui1 = new Ui("Kara ui", 5, 400);
  Ui ui2 = new Ui("Ak ui", 4, 350);
  Ui ui3 = new Ui("Mimoza", 5, 550);
  Ui ui4 = new Ui("Saryala ui", 6, 620);
  Ui ui5 = new Ui("Kuron ui", 5, 580);

  Ui[] uis = {ui1, ui2, ui3, ui4, ui5};
  Ui[] uis1 = {ui3, ui5};


  Koi koi1 = new Koi("Ak-Koi", 2, 30);
  Koi koi2 = new Koi("Nemo", 3, 35);
  Koi koi3 = new Koi("Nuncha", 2, 70);
  Koi koi4 = new Koi("Sarala", 3, 45);
  Koi koi5 = new Koi("Agala", 2, 55);
  Koi koi6 = new Koi("Fujaira", 3, 65);
  Koi koi7 = new Koi("Mojito", 2, 64);
  Koi koi8 = new Koi("Singa", 3, 58);

  Koi[] kois = {koi1, koi2, koi3, koi4, koi5, koi6, koi7, koi8};
  Koi[] kois1 = {koi3, koi5, koi6, koi8};


  At at1 = new At("Uragan", 4, 600);
  At at2 = new At("Tulpar", 3, 650);
  At at3 = new At("Jorgo", 4, 500);
  At at4 = new At("Akkula", 5, 660);
  At at5 = new At("Karager", 6, 700);

  At[] ats = {at1, at2};
  At[] ats1 = {at1, at2, at3, at4, at5};


  Jailoo jailoo1 = new Jailoo("Karkyra", "Yssyk-Kol", "Mirbek", uis, kois, ats);

  Jailoo jailoo2 = new Jailoo("Kok-Jaiyk", "Jeti-Oguz", "Asanbek", uis1, kois1, ats1);


  System.out.println("1chi jailoonun aty: " + jailoo1.getAty() + ", " + "Jailooun daregi: " + jailoo1.getDaregi() + ", " + "chabandyn aty: " + jailoo1.getChanbanAty());
  System.out.println("1chi jailoodogu uilardyn sany: " + uis.length + ", koilordun sany: " + kois.length + ", attardyn sany: " + ats.length);

  System.out.println("U  I  L  A  R");
  for (Ui a : jailoo1.getUilar()) {
   System.out.println("Aty: " + a.getAty() + ", Jashy: " + a.getJashy() + " jashta , " + "Salmagy: " + a.getSalmagy() + " kg");
  }
  System.out.println("____________________________________________________________________");

  System.out.println("K  O  I  L  O  R");
  for (Koi b : jailoo1.getKoilor()) {
   System.out.println("Aty: " + b.getAty() + ", Jashy: " + b.getJashy() + " jashta" + ", " + "Salmagy : " + b.getSalmagy() + " kg");
  }
  System.out.println("____________________________________________________________________");
  System.out.println("A  T  T  A  R");
  for (At c : jailoo1.getAttary()) {
   System.out.println("Aty: " + c.getAty() + ", Jashy: " + c.getJashy() + ", Salmagy: " + c.getSalmagy() + " kg");
  }
   System.out.println("***********************************************************************************************");

   System.out.println("2chi jailoonun aty: " + jailoo2.getAty() + ", " + "2chi jailoonun daregi: " + jailoo2.getDaregi() +
           ", " + "2chi chabandyn aty: " + jailoo2.getChanbanAty());
  System.out.println("2chi jailoodogu uilardyn sany: " + uis1.length + ", koilordun sany: " + kois1.length + ", attardyn sany: " + ats1.length);

   System.out.println("U  I  L  A  R");
   for(Ui d : jailoo2.getUilar()) {
    System.out.println("Aty: " + d.getAty() + ", Jashy: " + d.getJashy() + " jashta, " + "Salmagy: " + d.getSalmagy() + " kg");
   }
    System.out.println("____________________________________________________________________");

   System.out.println("K  O  I  L  O  R");
   for(Koi e: jailoo2.getKoilor()) {
    System.out.println("Aty: " + e.getAty() + ", Jashy: " + e.getJashy() + " jashta,  " + "Salmagy: " + e.getSalmagy() + " kg");
   }
   System.out.println("____________________________________________________________________");

   System.out.println("A  T  T  A  R");
   for(At f: jailoo2.getAttary()){
    System.out.println("Aty: " + f.getAty() + ", Jashy: " + f.getJashy() + " jashta, " + "Salmagy: " + f.getSalmagy() + " kg");

   }

   }
  }

