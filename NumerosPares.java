/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerospares;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author flaviorgs
 */
public class NumerosPares {

    /**
     * 
     */
    public static TreeSet<Integer> retornaPares(Integer... nums) throws NoIntegerException {
        if (nums.length == 0) {
            throw new NoIntegerException("Nenhum inteiro foi fornecido.");
        }

        TreeSet<Integer> pares = new TreeSet<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                pares.add(num);
            }
        }
        return pares;
    }
    
    
    public static void main(String[] args) throws NoIntegerException {
        // TODO code application logic here
        List<Integer> nums = new ArrayList<>();
        Random random = new Random();
        Scanner tecl = new Scanner(System.in);
        System.out.println("Qual o tamanho da lista? ");
        int tamanhoLista = tecl.nextInt();
 
        for (int i = 0; i < tamanhoLista; i++) {
            nums.add(random.nextInt(100));
        }
        
        System.out.println("\nInteiros digitados:");
        System.out.println(nums);
        
        TreeSet<Integer> setPares = retornaPares(nums.toArray(new Integer[0]));
        
        System.out.println("\nInteiros pares:");
        System.out.println(setPares);

    }
}