/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8_p1_luismontalvan;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author luism
 */
public class Lab8_P1_LuisMontalvan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner pochita = new Scanner(System.in);
        Outer:
        do {
            System.out.print("Menu-------\n1)Pocket Monsters\n2)Marvel o DC\n3)Salir\nIngrese una opcion: ");
            int opc = pochita.nextInt();
            switch (opc) {
                case 1:
                    pokemon();
                    break;
                case 2:
                    break;
                case 3:
                    break Outer;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (true);
    }

    public static void pokemon() {
        Scanner lelouch = new Scanner(System.in);
        Scanner pochita = new Scanner(System.in);
        ArrayList poke1 = new ArrayList();
        ArrayList poke2 = new ArrayList();
        boolean seguir = true;
        int cantPoke1 = 0;
        int cantPoke2 = 0;
        int soloTres = 0;
        PocketMonsters pokemon = new PocketMonsters("",0, 0, 0, 0);
        for (int i = 0; i < 2; i++) {
            soloTres=0;
            seguir = true;
            while (seguir == true) {
                if (i == 0) {
                    soloTres++;
                    if(soloTres>3){
                        seguir = false;
                    }
                    System.out.print("Ingrese el nombre del pokemon: ");
                    String name1 = lelouch.next();
                    System.out.print("Ingrese el ataque del pokemon: ");
                    pokemon.setAtk1(pochita.nextInt());
                    System.out.print("Ingrese la vida del pokemon: ");
                    pokemon.setHp1(pochita.nextInt());
                    pokemon.setLuck1(new Random().nextInt(((5 - 1) + 1) + 1));
                    pokemon.setI(0);
                    poke1.add(name1);
                    pokemon.entrenadores();
                    cantPoke1++;
                    System.out.print("Desea agregar otro pokemon al equipo? [s/n]:");
                    String resp = lelouch.next();
                    if(resp.equalsIgnoreCase("s")){
                        seguir = true;
                    }else{
                        seguir = false;
                    }
                    
                }else if(i == 1){
                    soloTres++;
                    if(soloTres>3){
                        seguir = false;
                    }
                    cantPoke2++;
                    System.out.print("Ingrese el nombre del pokemon: ");
                    String name2 = lelouch.next();
                    System.out.print("Ingrese el ataque del pokemon: ");
                    pokemon.setAtk2(pochita.nextInt());
                    System.out.print("Ingrese la vida del pokemon: ");
                    pokemon.setHp2(pochita.nextInt());
                    pokemon.setLuck2(new Random().nextInt(((5 - 1) + 1) + 1));
                    poke2.add(name2);
                    pokemon.entrenadores();
                    cantPoke1++;
                    System.out.print("Desea agregar otro pokemon al equipo? [s/n]:");
                    String resp = lelouch.next();
                    if(resp.equalsIgnoreCase("s")){
                        seguir = true;
                    }else{
                        seguir = false;
                    }
                }
            }
            
            
        }
        
            combate(poke1,poke2, cantPoke1, cantPoke2);
            
            
    }
    public static void combate(ArrayList poke1, ArrayList poke2, int cantPoke1, int cantPoke2){
        PocketMonsters pokemon = new PocketMonsters("", 0, 0,0, 0);
        int ronda = 1;
        int hp1= pokemon.getHp1();
        int hp2=pokemon.getHp2();
        int atk1=pokemon.getAtk1();
        int atk2=pokemon.getAtk2();
        int luck1= pokemon.getLuck1();
        int luck2= pokemon.getLuck2();
        while(cantPoke1>0&&cantPoke2>0){
            ronda = 1;
            while(hp1>0&&hp2>0){
                
                System.out.println("-----Ronda "+ronda+"-----");
                    if(luck2>luck1){
                       System.out.println(poke2.get(0)+" ataca primero. Tiene: "+hp2+"Puntos de vida y "+luck2+" de suerte\n"+poke1.get(0)+" ataca segundo. Tiene "+hp1+" puntos de vida y "+luck1+" de suerte");
                       hp1-= atk2;
                       pokemon.setHp2(hp2);
                       if(hp1>0){
                           hp2-= atk1;
                           pokemon.setHp2(hp2);
                       }
                       System.out.println("**Puntos Restantes**\n"+poke2.get(0)+" tiene "+hp2+" restantes\n"+poke1.get(0)+" tiene "+hp1+" restantes");
                    }else{
                        System.out.println(poke1.get(0)+" ataca primero. Tiene: "+hp1+"Puntos de vida y "+luck1+" de suerte\n"+poke2.get(0)+" ataca segundo. Tiene "+hp2+" puntos de vida y "+luck2+ " puntos de suerte");
                        hp2-= atk1;
                        pokemon.setHp2(hp2);
                       if(hp2>0){
                           hp1-= atk2;
                           pokemon.setHp2(hp2);
                       }
                       System.out.println("**Puntos Restantes**\n"+poke1.get(0)+" tiene "+hp2+" restantes\n"+poke2.get(0)+" tiene "+hp2+" restantes");
                    }
                    if(hp1<=0){
                        System.out.println("-----Resultados-----\n"+poke2.get(0)+ " ES EL GANADOR");
                        poke1.remove(0);
                        
                    }else{
                        System.out.println("-----Resultados-----\n"+poke1.get(0)+ " ES EL GANADOR");
                        poke2.remove(0);
                    }
            }
        }
    }
}