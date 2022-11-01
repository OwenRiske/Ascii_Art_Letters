package com.company;

import java.util.ArrayList;
import java.util.List;

public class Ascii_Letters {
    public static String[] asciiLetters(String userInput, String font){
        String[] input = userInput.split("");

        List<String> line1 = new ArrayList<>();
        List<String> line2 = new ArrayList<>();
        List<String> line3 = new ArrayList<>();
        List<String> line4 = new ArrayList<>();
        List<String> line5 = new ArrayList<>();


        for (int i = 0; i < input.length; i++) {


            // ascii art from https://patorjk.com/software/taag/#p=display&f=Four%20Tops&t=
            if (input[i].equalsIgnoreCase("a")) {
                if (font.equalsIgnoreCase("swan")){
                    line1.add("    .      ");
                    line2.add("   / \\     ");
                    line3.add("  /___\\    ");
                    line4.add(" /     \\   ");
                    line5.add("'       `  ");
                }
                else{
                    line1.add("  /\\    ");
                    line2.add(" /__\\   ");
                    line3.add("/    \\  ");
                }
            } else if (input[i].equalsIgnoreCase("b")) {
                if (font.equalsIgnoreCase("swan")){
                    line1.add(".--.   ");
                    line2.add("|   )  ");
                    line3.add("|--:   ");
                    line4.add("|   )  ");
                    line5.add("'--'   ");
                }
                else{

                    line1.add("|~~\\  ");
                    line2.add("|--<  ");
                    line3.add("|__/  ");}
            } else if (input[i].equalsIgnoreCase("c")) {
                if (font.equalsIgnoreCase("swan")){
                    line1.add(" .--.  ");
                    line2.add(":      ");
                    line3.add("|      ");
                    line4.add(":      ");
                    line5.add(" `--'  ");
                }
                else{
                    line1.add(" /~~  ");
                    line2.add("|     ");
                    line3.add(" \\__  ");}
            } else if (input[i].equalsIgnoreCase("d")) {
                if (font.equalsIgnoreCase("swan")){
                    line1.add(".--.   ");
                    line2.add("|   :  ");
                    line3.add("|   |  ");
                    line4.add("|   ;  ");
                    line5.add("'--'   ");
                }
                else{
                    line1.add("|~~\\   ");
                    line2.add("|   |  ");
                    line3.add("|__/   ");}
            } else if (input[i].equalsIgnoreCase("e")) {
                if (font.equalsIgnoreCase("swan")){
                    line1.add(".---.  ");
                    line2.add("|      ");
                    line3.add("|---   ");
                    line4.add("|      ");
                    line5.add("'---'  ");
                }
                else{
                    line1.add("|~~  ");
                    line2.add("|--  ");
                    line3.add("|__  ");}
            } else if (input[i].equalsIgnoreCase("f")) {
                if (font.equalsIgnoreCase("swan")){
                    line1.add(".---.  ");
                    line2.add("|      ");
                    line3.add("|---   ");
                    line4.add("|      ");
                    line5.add("'      ");
                }
                else{
                    line1.add("|~~  ");
                    line2.add("|--  ");
                    line3.add("|    ");}
            } else if (input[i].equalsIgnoreCase("g")) {
                if (font.equalsIgnoreCase("swan")){
                    line1.add(" .--.  ");
                    line2.add(":      ");
                    line3.add("| --.  ");
                    line4.add(":   |  ");
                    line5.add(" `--'  ");
                }
                else{
                    line1.add(" /~~\\  ");
                    line2.add("|  __  ");
                    line3.add(" \\__/  ");}
            } else if (input[i].equalsIgnoreCase("h")) {
                if (font.equalsIgnoreCase("swan")){
                    line1.add(".   .  ");
                    line2.add("|   |  ");
                    line3.add("|---|  ");
                    line4.add("|   |  ");
                    line5.add("'   '  ");
                }
                else{
                    line1.add("|  |  ");
                    line2.add("|--|  ");
                    line3.add("|  |  ");}
            } else if (input[i].equalsIgnoreCase("i")) {
                if (font.equalsIgnoreCase("swan")){
                    line1.add("--.--  ");
                    line2.add("  |    ");
                    line3.add("  |    ");
                    line4.add("  |    ");
                    line5.add("--'--  ");
                }
                else{
                    line1.add("'  ");
                    line2.add("|  ");
                    line3.add("|  ");}
            } else if (input[i].equalsIgnoreCase("j")) {
                if (font.equalsIgnoreCase("swan")){
                    line1.add(".---.  ");
                    line2.add("    |  ");
                    line3.add("    |  ");
                    line4.add("    ;  ");
                    line5.add("`--'   ");
                }
                else{
                    line1.add("   '  ");
                    line2.add("   |  ");
                    line3.add("\\__|  ");}
            } else if (input[i].equalsIgnoreCase("k")) {
                if (font.equalsIgnoreCase("swan")){
                    line1.add(".   .  ");
                    line2.add("|  /   ");
                    line3.add("|-'    ");
                    line4.add("|  \\   ");
                    line5.add("'   `  ");
                }
                else{
                    line1.add("| /  ");
                    line2.add("|(   ");
                    line3.add("| \\  ");}
            } else if (input[i].equalsIgnoreCase("l")) {
                if (font.equalsIgnoreCase("swan")){
                    line1.add(".      ");
                    line2.add("|      ");
                    line3.add("|      ");
                    line4.add("|      ");
                    line5.add("'---'  ");
                }
                else{
                    line1.add("|    ");
                    line2.add("|    ");
                    line3.add("|__  ");}
            } else if (input[i].equalsIgnoreCase("m")) {
                if (font.equalsIgnoreCase("swan")){
                    line1.add(".    .  ");
                    line2.add("|\\  /|  ");
                    line3.add("| \\/ |  ");
                    line4.add("|    |  ");
                    line5.add("'    '  ");
                }
                else{
                    line1.add("|\\  /|  ");
                    line2.add("| \\/ |  ");
                    line3.add("|    |  ");}
            } else if (input[i].equalsIgnoreCase("n")) {
                if (font.equalsIgnoreCase("swan")){
                    line1.add(".   .  ");
                    line2.add("|\\  |  ");
                    line3.add("| \\ |  ");
                    line4.add("|  \\|  ");
                    line5.add("'   '  ");
                }
                else{
                    line1.add("|\\  |  ");
                    line2.add("| \\ |  ");
                    line3.add("|  \\|  ");}
            } else if (input[i].equalsIgnoreCase("o")) {
                if (font.equalsIgnoreCase("swan")){
                    line1.add(" .--.   ");
                    line2.add(":    :  ");
                    line3.add("|    |  ");
                    line4.add(":    ;  ");
                    line5.add(" `--'   ");
                }
                else{
                    line1.add(" /~~\\   ");
                    line2.add("|    |  ");
                    line3.add(" \\__/   ");}
            } else if (input[i].equalsIgnoreCase("p")) {
                if (font.equalsIgnoreCase("swan")){
                    line1.add(".--.   ");
                    line2.add("|   )  ");
                    line3.add("|--'   ");
                    line4.add("|      ");
                    line5.add("'      ");
                }
                else{
                    line1.add("|~~\\  ");
                    line2.add("|__/  ");
                    line3.add("|     ");}
            } else if (input[i].equalsIgnoreCase("q")) {
                if (font.equalsIgnoreCase("swan")){
                    line1.add(" .--.   ");
                    line2.add(":    :  ");
                    line3.add("|    |  ");
                    line4.add(":  ( ;  ");
                    line5.add(" `--`-  ");
                }
                else{
                    line1.add(" /~~\\   ");
                    line2.add("|    |  ");
                    line3.add(" \\__X   ");}
            } else if (input[i].equalsIgnoreCase("r")) {
                if (font.equalsIgnoreCase("swan")){
                    line1.add(".--.   ");
                    line2.add("|   )  ");
                    line3.add("|--'   ");
                    line4.add("|  \\   ");
                    line5.add("'   `  ");
                }
                else{
                    line1.add("|~~\\  ");
                    line2.add("|__/  ");
                    line3.add("|  \\  ");}
            } else if (input[i].equalsIgnoreCase("s")) {
                if (font.equalsIgnoreCase("swan")){
                    line1.add(" .-.   ");
                    line2.add("(      ");
                    line3.add(" `-.   ");
                    line4.add("    )  ");
                    line5.add(" `-'   ");
                }
                else{
                    line1.add("/~~\\  ");
                    line2.add("`--.  ");
                    line3.add("\\__/  ");}
            } else if (input[i].equalsIgnoreCase("t")) {
                if (font.equalsIgnoreCase("swan")){
                    line1.add(".---.  ");
                    line2.add("  |    ");
                    line3.add("  |    ");
                    line4.add("  |    ");
                    line5.add("  '    ");
                }
                else{
                    line1.add("~~|~~  ");
                    line2.add("  |    ");
                    line3.add("  |    ");}
            } else if (input[i].equalsIgnoreCase("u")) {
                if (font.equalsIgnoreCase("swan")){
                    line1.add(".   .  ");
                    line2.add("|   |  ");
                    line3.add("|   |  ");
                    line4.add(":   ;  ");
                    line5.add(" `-'   ");
                }
                else{
                    line1.add("|    |  ");
                    line2.add("|    |  ");
                    line3.add(" \\__/   ");}
            } else if (input[i].equalsIgnoreCase("v")) {
                if (font.equalsIgnoreCase("swan")){
                    line1.add(".       .  ");
                    line2.add(" \\     /   ");
                    line3.add("  \\   /    ");
                    line4.add("   \\ /     ");
                    line5.add("    '      ");
                }
                else{
                    line1.add("\\    /  ");
                    line2.add(" \\  /   ");
                    line3.add("  \\/    ");}
            } else if (input[i].equalsIgnoreCase("w")) {
                if (font.equalsIgnoreCase("swan")){
                    line1.add(".          .  ");
                    line2.add(" \\        /   ");
                    line3.add("  \\  /\\  /    ");
                    line4.add("   \\/  \\/     ");
                    line5.add("    '  '      ");
                }
                else{
                    line1.add("|  |  |  ");
                    line2.add("|  |  |  ");
                    line3.add(" \\/ \\/   ");}
            } else if (input[i].equalsIgnoreCase("x")) {
                if (font.equalsIgnoreCase("swan")){
                    line1.add(".    .  ");
                    line2.add(" \\ /   ");
                    line3.add("  /    ");
                    line4.add(" / \\   ");
                    line5.add("'   '  ");
                }
                else{
                    line1.add("\\ /  ");
                    line2.add(" X   ");
                    line3.add("/ \\  ");}
            } else if (input[i].equalsIgnoreCase("y")) {
                if (font.equalsIgnoreCase("swan")){
                    line1.add(".   .  ");
                    line2.add(" \\ /   ");
                    line3.add("  :    ");
                    line4.add("  |    ");
                    line5.add("  '    ");
                }
                else{
                    line1.add("\\   /  ");
                    line2.add(" \\ /   ");
                    line3.add("  |    ");}
            } else if (input[i].equalsIgnoreCase("z")) {
                if (font.equalsIgnoreCase("swan")){
                    line1.add(".---.  ");
                    line2.add("   /   ");
                    line3.add("  /    ");
                    line4.add(" /     ");
                    line5.add("'---'  ");
                }
                else{
                    line1.add("~~/  ");
                    line2.add(" /   ");
                    line3.add("/__  ");}
            } else if (input[i].equalsIgnoreCase("!")) {
                if (font.equalsIgnoreCase("swan")){
                    line1.add(".  ");
                    line2.add("|  ");
                    line3.add("|  ");
                    line4.add("'  ");
                    line5.add("o  ");
                }
                else{
                    line1.add("|  ");
                    line2.add("|  ");
                    line3.add(".  ");}
            }
            else if (input[i].equalsIgnoreCase("?")) {
                if (font.equalsIgnoreCase("swan")) {
                    line1.add(" .-.   ");
                    line2.add("'   )  ");
                    line3.add("   /   ");
                    line4.add("  '    ");
                    line5.add("  o    ");
                }
                else{

                    line1.add("/~\\  ");
                    line2.add(" _/  ");
                    line3.add(" !   ");}
            }
            else if (input[i].equalsIgnoreCase("@")) {
                if (font.equalsIgnoreCase("swan")){
                    line1.add("  .-`-.    ");
                    line2.add(".' .-. `.  ");
                    line3.add("| (   ) ;  ");
                    line4.add("`. `-'`'   ");
                    line5.add("  `---     ");
                }
                else{
                    line1.add(" /~~\\   ");
                    line2.add("| (|_|  ");
                    line3.add(" \\__    ");}
            }
            else if (input[i].equalsIgnoreCase("#")){
                if (font.equalsIgnoreCase("swan")){
                    line1.add(" .  .   ");
                    line2.add("_|__|_  ");
                    line3.add(" |  |   ");
                    line4.add("-|--|-  ");
                    line5.add(" '  '   ");
                }
                else{
                    line1.add("       ");
                    line2.add("-|-|-  ");
                    line3.add("-|-|-  ");}
            }
            else if (input[i].equalsIgnoreCase("%")){
                if (font.equalsIgnoreCase("swan")){
                    line1.add(" _      ");
                    line2.add("(_) ,'  ");
                    line3.add("  ,'_   ");
                    line4.add(",' (_)  ");
                    line5.add("        ");
                }
                else{
                    line1.add(". /  ");
                    line2.add(" /   ");
                    line3.add("/ .  ");}
            }
            else if (input[i].equalsIgnoreCase("^")){
                if (font.equalsIgnoreCase("swan")){
                    line1.add("  .    ");
                    line2.add(".' `.  ");
                    line3.add("       ");
                    line4.add("       ");
                    line5.add("       ");
                }
                else{
                    line1.add("/\\  ");
                    line2.add("    ");
                    line3.add("    ");}
            }
            else if (input[i].equalsIgnoreCase("*")){
                if (font.equalsIgnoreCase("swan")){
                    line1.add("   .     ");
                    line2.add("_  |  _  ");
                    line3.add(" `-:-'   ");
                    line4.add("  / \\    ");
                    line5.add(" '   `   ");
                }
                else{
                    line1.add("\\ /  ");
                    line2.add("-X-  ");
                    line3.add("/ \\  ");}
            }
            else if (input[i].equalsIgnoreCase("(")){
                if (font.equalsIgnoreCase("swan")){
                    line1.add(" ._  ");
                    line2.add(":    ");
                    line3.add("|    ");
                    line4.add(":    ");
                    line5.add("'._  ");

                }
                else{

                    line1.add(" /  ");
                    line2.add("|   ");
                    line3.add(" \\  ");}
            }
            else if (input[i].equalsIgnoreCase(")")) {
                if (font.equalsIgnoreCase("swan")) {

                    line1.add("-.   ");
                    line2.add("  :  ");
                    line3.add("  |  ");
                    line4.add("  :  ");
                    line5.add("_.'  ");
                } else {
                    line1.add(" \\  ");
                    line2.add(" |  ");
                    line3.add(" /  ");
                }
            }
            else if (input[i].equalsIgnoreCase("_")) {
                if (font.equalsIgnoreCase("swan")) {
                    line1.add("      ");
                    line2.add("      ");
                    line3.add("      ");
                    line4.add("      ");
                    line5.add("____  ");
                } else {
                    line1.add("     ");
                    line2.add("     ");
                    line3.add("___  ");
                }
            }
            else if (input[i].equalsIgnoreCase("-")){
                if (font.equalsIgnoreCase("swan")) {
                    line1.add("      ");
                    line2.add("      ");
                    line3.add("____  ");
                    line4.add("      ");
                    line5.add("      ");
                } else {
                    line1.add("     ");
                    line2.add("---  ");
                    line3.add("     ");
                }}
            else if (input[i].equalsIgnoreCase("+")){
                if (font.equalsIgnoreCase("swan")) {
                    line1.add("   .     ");
                    line2.add("   |   ");
                    line3.add("---+---  ");
                    line4.add("   |     ");
                    line5.add("   '     ");
                } else {
                    line1.add(" .   ");
                    line2.add("-+-  ");
                    line3.add(" '   ");
                }}
            else if (input[i].equalsIgnoreCase("=")){
                if (font.equalsIgnoreCase("swan")) {
                    line1.add("      ");
                    line2.add("      ");
                    line3.add("----  ");
                    line4.add("----  ");
                    line5.add("      ");
                } else {
                    line1.add("     ");
                    line2.add("---  ");
                    line3.add("---  ");}
            }
            else if (input[i].equalsIgnoreCase("\\")){
                if (font.equalsIgnoreCase("swan")) {
                    line1.add(".      ");
                    line2.add(" \\     ");
                    line3.add("  \\    ");
                    line4.add("   \\   ");
                    line5.add("    `  ");
                } else {

                    line1.add("\\    ");
                    line2.add(" \\   ");
                    line3.add("  \\  ");
                }}
            else if (input[i].equalsIgnoreCase("|")){
                if (font.equalsIgnoreCase("swan")) {
                    line1.add(".  ");
                    line2.add("|  ");
                    line3.add("|  ");
                    line4.add("|  ");
                    line5.add("'  ");
                } else {
                    line1.add(" |   ");
                    line2.add(" |   ");
                    line3.add(" |   ");}
            }
            else if (input[i].equalsIgnoreCase("]")){
                if (font.equalsIgnoreCase("swan")) {
                    line1.add("--.  ");
                    line2.add("  |  ");
                    line3.add("  |  ");
                    line4.add("  |  ");
                    line5.add("--'  ");
                } else {
                    line1.add("~|  ");
                    line2.add(" |  ");
                    line3.add("_|  ");}
            }
            else if (input[i].equalsIgnoreCase("[")){
                if (font.equalsIgnoreCase("swan")) {
                    line1.add(".--  ");
                    line2.add("|    ");
                    line3.add("|    ");
                    line4.add("|    ");
                    line5.add("'--  ");
                } else {
                    line1.add("|~  ");
                    line2.add("|   ");
                    line3.add("|_  ");
                }}
            else if (input[i].equalsIgnoreCase("}")){
                if (font.equalsIgnoreCase("swan")) {
                    line1.add("-.   ");
                    line2.add(" |   ");
                    line3.add("  >  ");
                    line4.add(" |   ");
                    line5.add("_'   ");
                } else {
                    line1.add("~|   ");
                    line2.add("  >  ");
                    line3.add("~|   ");
                }}
            else if (input[i].equalsIgnoreCase("{")){
                if (font.equalsIgnoreCase("swan")) {
                    line1.add(" .-  ");
                    line2.add(" |   ");
                    line3.add("<    ");
                    line4.add(" |   ");
                    line5.add(" '_  ");
                } else {
                    line1.add(" |~  ");
                    line2.add("<    ");
                    line3.add(" |_  ");}
            }
            else if (input[i].equalsIgnoreCase("~")){
                if (font.equalsIgnoreCase("swan")) {
                    line1.add("          ");
                    line2.add("          ");
                    line3.add(" .-.   .  ");
                    line4.add("'   `-'   ");
                    line5.add("          ");
                } else {

                    line1.add("      ");
                    line2.add("_-_-  ");
                    line3.add("      ");
                }}
            else if (input[i].equalsIgnoreCase("`")){
                if (font.equalsIgnoreCase("swan")) {
                    line1.add("o    ");
                    line2.add(" \\  ");
                    line3.add("     ");
                    line4.add("     ");
                    line5.add("     ");
                } else {

                    line1.add("\\  ");
                    line2.add("   ");
                    line3.add("   ");}
            }
            else if (input[i].equalsIgnoreCase(":")){
                if (font.equalsIgnoreCase("swan")) {
                    line1.add("   ");
                    line2.add("o  ");
                    line3.add("   ");
                    line4.add("o  ");
                    line5.add("   ");
                } else {


                    line1.add("   ");
                    line2.add(".  ");
                    line3.add(".  ");}
            }
            else if (input[i].equalsIgnoreCase(";")){
                if (font.equalsIgnoreCase("swan")) {
                    line1.add("    ");
                    line2.add(" o  ");
                    line3.add("    ");
                    line4.add(" o  ");
                    line5.add("-'  ");
                } else {
                    line1.add("   ");
                    line2.add(".  ");
                    line3.add(",  ");}
            }
            else if (input[i].equalsIgnoreCase("/")){
                if (font.equalsIgnoreCase("swan")) {
                    line1.add("    ,  ");
                    line2.add("   /   ");
                    line3.add("  /    ");
                    line4.add(" /     ");
                    line5.add("'      ");
                } else {

                    line1.add("  /  ");
                    line2.add(" /   ");
                    line3.add("/    ");
                }}
            else if (input[i].equalsIgnoreCase(".")){
                if (font.equalsIgnoreCase("swan")) {
                    line1.add("   ");
                    line2.add("   ");
                    line3.add("   ");
                    line4.add("   ");
                    line5.add("o  ");
                } else {
                    line1.add("   ");
                    line2.add("   ");
                    line3.add(".  ");}
            }
            else if (input[i].equalsIgnoreCase(">")){
                if (font.equalsIgnoreCase("swan")) {
                    line1.add("`.     ");
                    line2.add("  `.   ");
                    line3.add("   .`  ");
                    line4.add(" .'    ");
                    line5.add("'      ");
                } else {
                    line1.add("\\  ");
                    line2.add("/  ");
                    line3.add("   ");}
            }
            else if (input[i].equalsIgnoreCase("<")){
                if (font.equalsIgnoreCase("swan")) {
                    line1.add("   .'  ");
                    line2.add(" .'    ");
                    line3.add("`.     ");
                    line4.add("  `.   ");
                    line5.add("    `  ");
                } else {
                    line1.add("/  ");
                    line2.add("\\  ");
                    line3.add("   ");}
            }
            else if (input[i].equalsIgnoreCase(",")){
                if (font.equalsIgnoreCase("swan")) {
                    line1.add("    ");
                    line2.add("    ");
                    line3.add("    ");
                    line4.add(" o  ");
                    line5.add("-'  ");
                } else {
                    line1.add("   ");
                    line2.add("   ");
                    line3.add("/  ");}
            }
            else if (input[i].equalsIgnoreCase("1")){
                if (font.equalsIgnoreCase("swan")) {
                    line1.add("  .    ");
                    line2.add(".'|    ");
                    line3.add("  |    ");
                    line4.add("  |    ");
                    line5.add("'---'  ");
                } else {

                    line1.add("/|   ");
                    line2.add(" |   ");
                    line3.add("_|_  ");}
            }
            else if (input[i].equalsIgnoreCase("2")){
                if (font.equalsIgnoreCase("swan")) {
                    line1.add(" .-.   ");
                    line2.add("(   )  ");
                    line3.add("  .'   ");
                    line4.add(" /     ");
                    line5.add("'---'  ");
                } else {
                    line1.add("/~\\  ");
                    line2.add(" ,/  ");
                    line3.add("/__  ");}
            }
            else if (input[i].equalsIgnoreCase("3")){
                if (font.equalsIgnoreCase("swan")) {
                    line1.add(".--.   ");
                    line2.add("    )  ");
                    line3.add(" --:   ");
                    line4.add("    )  ");
                    line5.add("`--'   ");
                } else {
                    line1.add("/~\\  ");
                    line2.add("  <  ");
                    line3.add("\\_/  ");}
            }
            else if (input[i].equalsIgnoreCase("4")){
                if (font.equalsIgnoreCase("swan")) {
                    line1.add(".  .   ");
                    line2.add("|  |   ");
                    line3.add("'--|-  ");
                    line4.add("   |   ");
                    line5.add("   '   ");
                } else {
                    line1.add(" /|   ");
                    line2.add("/_|_  ");
                    line3.add("  |   ");}
            }
            else if (input[i].equalsIgnoreCase("5")){
                if (font.equalsIgnoreCase("swan")) {
                    line1.add(".---.  ");
                    line2.add("|      ");
                    line3.add("'--.   ");
                    line4.add(".   )  ");
                    line5.add(" `-'   ");
                } else {
                    line1.add("|~~  ");
                    line2.add("`~\\  ");
                    line3.add("__/  ");
                }}
            else if (input[i].equalsIgnoreCase("6")){
                if (font.equalsIgnoreCase("swan")) {
                    line1.add("   ,   ");
                    line2.add("  /    ");
                    line3.add(" /-.   ");
                    line4.add("(   )  ");
                    line5.add(" `-'   ");
                } else {
                    line1.add("/~~  ");
                    line2.add("Y~\\  ");
                    line3.add("\\_/  ");}
            }
            else if (input[i].equalsIgnoreCase("7")){
                if (font.equalsIgnoreCase("swan")) {
                    line1.add(".---.  ");
                    line2.add("    /  ");
                    line3.add("   /   ");
                    line4.add("  /    ");
                    line5.add(" '     ");
                } else {

                    line1.add("~~/  ");
                    line2.add(" /   ");
                    line3.add(" /   ");}
            }
            else if (input[i].equalsIgnoreCase("8")){
                if (font.equalsIgnoreCase("swan")) {
                    line1.add(" .-.   ");
                    line2.add("(   )  ");
                    line3.add(" >-<   ");
                    line4.add("(   )  ");
                    line5.add(" `-'   ");
                } else {
                    line1.add("(~)  ");
                    line2.add("/~\\  ");
                    line3.add("\\_/  ");}
            }
            else if (input[i].equalsIgnoreCase("9")){
                if (font.equalsIgnoreCase("swan")) {
                    line1.add(" .-.   ");
                    line2.add("(   )  ");
                    line3.add(" `-/   ");
                    line4.add("  /    ");
                    line5.add(" '     ");
                } else {

                    line1.add("/~\\  ");
                    line2.add("`-/  ");
                    line3.add(" /   ");}
            }
            else if (input[i].equalsIgnoreCase("0")){
                if (font.equalsIgnoreCase("swan")) {
                    line1.add(" .-.   ");
                    line2.add(":   :  ");
                    line3.add("|   |  ");
                    line4.add(":   ;  ");
                    line5.add(" `-'   ");
                } else {

                    line1.add(" /~~\\   ");
                    line2.add("|    |  ");
                    line3.add(" \\__/   ");}
            }
            else if (input[i].equalsIgnoreCase("$")){
                if (font.equalsIgnoreCase("swan")) {
                    line1.add(" ..   ");
                    line2.add(".|-.  ");
                    line3.add("`-|.  ");
                    line4.add("`|-'  ");
                    line5.add(" ''   ");
                } else {
                    line1.add("|  ");
                    line2.add("s  ");
                    line3.add("|  ");}
            }
            else if (input[i].equalsIgnoreCase("&")){
                if (font.equalsIgnoreCase("swan")) {
                    line1.add("  .-.    ");
                    line2.add(" (   )   ");
                    line3.add(" .--'    ");
                    line4.add("(   `.)  ");
                    line5.add(" `---'`  ");
                } else {

                    line1.add("(~)  ");
                    line2.add(" x   ");
                    line3.add("(_x  ");
                }}
        }

        for (int i = 0; i < line1.size(); i++) {
            System.out.print(line1.get(i));
        }
        if (line2.size()>0){
            System.out.println();
            for (int i = 0; i < line2.size(); i++) {
                System.out.print(line2.get(i));
            }}
        if (line3.size()>0){
            System.out.println();
            for (int i = 0; i < line3.size(); i++) {
                System.out.print(line3.get(i));
            }}
        if (line4.size()>0){
            System.out.println();
            for (int i = 0; i < line3.size(); i++) {
                System.out.print(line4.get(i));
            }}
        if (line5.size()>0){
            System.out.println();
            for (int i = 0; i < line3.size(); i++) {
                System.out.print(line5.get(i));
            }}
        return input;
    }
}
