package com.bridge.labzs;

import java.util.regex.Pattern;

public class sampleRegex {
    static boolean Validate(String pattern, String userInput) {
        return Pattern.compile(pattern).matcher(userInput).matches();
    }

    public static void main(String[] args) {

        String emailIdPattern = "^[a-zA-Z]+([_+-.][a-zA-Z])*[@][a-zA-Z]+[.][a-z]{2,3}([.][a-zA-Z]{2})*$";

        //VALID
        String validEmailArray[] = new String[9];//CREATE ARRAY
        validEmailArray[0]="abc@yahoo.com";
        validEmailArray[1]="abc-100@yahoo.com";
        validEmailArray[2]="abc.100@yahoo.com";
        validEmailArray[3]="abc111@abc.com";
        validEmailArray[4]="abc-100@abc.net";
        validEmailArray[5]="abc.100@abc.com.au";
        validEmailArray[6]="abc@1.com";
        validEmailArray[7]="abc@gmail.com.com";
        validEmailArray[8]="abc+100@gmail.com";
        System.out.println("-------------VALID EMAIL ID's-----------------");
        for (int i = 0; i < validEmailArray.length; i++) {
            boolean isValid = Validate(emailIdPattern, validEmailArray[i]);
            if (isValid)
                System.out.println(i+"->Valid");
            else
                System.out.println(i+"->InValid ");
        }
        //INVALID
        String[] inValidEmailArray = new String[13];//CREATE ARRAY
        inValidEmailArray[0]="abc";
        inValidEmailArray[1]="abc@.com.my";
        inValidEmailArray[2]="abc123@gmail.a";
        inValidEmailArray[3]="abc123@.com";
        inValidEmailArray[4]="abc123@.com.com";
        inValidEmailArray[5]=".abc@abc.com";
        inValidEmailArray[6]="abc()*@gmail.com";
        inValidEmailArray[7]="abc@%*.com";
        inValidEmailArray[8]="abc..2002@gmail.com";
        inValidEmailArray[9]="abc.@gmail.com";
        inValidEmailArray[10]="abc@abc@gmail.com";
        inValidEmailArray[11]="abc@gmail.com.1a";
        inValidEmailArray[12]="abc@gmail.com.aa.au";
        System.out.println("-------------IN-VALID EMAIL ID's-----------------");
        for (int i = 0; i < inValidEmailArray.length; i++) {
            boolean isValid = Validate(emailIdPattern, inValidEmailArray[i]);
            if (isValid)
                System.out.println(i+"->Valid ");
            else
                System.out.println(i+"->InValid ");
        }
    }
}




