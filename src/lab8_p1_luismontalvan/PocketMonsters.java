/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8_p1_luismontalvan;
import java.util.ArrayList;
/**
 *
 * @author luism
 */
public class PocketMonsters {
    ArrayList namePoke1 = new ArrayList();
    ArrayList atkPoke1 = new ArrayList();
    ArrayList hpPoke1 = new ArrayList();
    ArrayList luckPoke1 = new ArrayList();
    ArrayList namePoke2 = new ArrayList();
    ArrayList atkPoke2 = new ArrayList();
    ArrayList hpPoke2 = new ArrayList();
    ArrayList luckPoke2 = new ArrayList();
    public String name;
    public int atk;
    public int hp;
    public int luck;
    public int i;


    public PocketMonsters(String name, int atk, int hp, int luck, int i) {
        this.name = name;
        this.atk = atk;
        this.hp = hp;
        this.luck = luck;
        this.i = i;
    }
    
    
    public String getName() {
        
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAtk1() {
        return (int)atkPoke1.get(0);
    }

    public void setAtk1(int atk) {
        this.atk = atk;
    }

    public int getHp1() {
        return (int)hpPoke1.get(0);
    }

    public void setHp1(int hp) {
        hpPoke1.set(0,hp);
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getLuck1() {
        return (int)luckPoke1.get(0);
    }

    public void setLuck1(int luck) {
        this.luck = luck;
    }
    public int getAtk2() {
        return (int)atkPoke2.get(0);
    }

    public void setAtk2(int atk) {
        this.atk = atk;
    }

    public int getHp2() {
        return (int)atkPoke1.get(0);
    }

    public void setHp2(int hp) {
        hpPoke2.set(0,hp);
    }

    public int getLuck2() {
        return luck;
    }

    public void setLuck2(int luck) {
        this.luck = luck;
    }
    public void entrenadores(){
        if(i== 0){
            namePoke1.add(name);
            atkPoke1.add(atk);
            hpPoke1.add(hp);
            luckPoke1.add(luck);
        }else if(i == 1){
            namePoke2.add(name);
            atkPoke2.add(atk);
            hpPoke2.add(hp);
            luckPoke2.add(luck);
        }
        namePoke1.stream().forEach(System.out::println);
        namePoke2.stream().forEach(System.out::println);
    }
}
