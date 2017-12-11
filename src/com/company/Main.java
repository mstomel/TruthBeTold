package com.company;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean A = true, B = true;
        Scanner x = new Scanner(System.in);
        System.out.println("input expression with spaces");
        String expression = x.nextLine();
        String parts[] = expression.split(" ");
        if (parts[0].equalsIgnoreCase("A")) {

            if (parts[1].equalsIgnoreCase("&&")) {

                if (parts[2].equalsIgnoreCase("B")) {

                    System.out.println(A + "\t" + B + "\t" + (A&&B));

                }
                else if (parts[2].equalsIgnoreCase("!B")) {

                    System.out.println(A + "\t" + !B + "\t" + (A&&!B));

                }

            }
            else if (parts[1].equalsIgnoreCase("||")) {

                if (parts[2].equalsIgnoreCase("B")) {

                    System.out.println(A + "\t" + B + "\t" + (A||B));

                }
                else if (parts[2].equalsIgnoreCase("!B")) {

                    System.out.println(A + "\t" + B + "\t" + (A||!B));

                }

            }

        }
        else if (parts[0].equalsIgnoreCase("!A")) {

            if (parts[1].equalsIgnoreCase("&&")) {

                if (parts[2].equalsIgnoreCase("B")) {

                    System.out.println(!A + "\t" + B + "\t" + (!A&&B));

                }
                else if (parts[2].equalsIgnoreCase("!B")) {

                    System.out.println(!A + "\t" + !B + "\t" + (!A&&!B));

                }

            }
            else if (parts[1].equalsIgnoreCase("||")) {

                if (parts[2].equalsIgnoreCase("B")) {

                    System.out.println(!A + "\t" + B + "\t" + (!A||B));

                }
                else if (parts[2].equalsIgnoreCase("!B")) {

                    System.out.println(!A + "\t" + !B + "\t" + (A||B));

                }

            }

        }

        /*System.out.println("& or |");
        String opp = x.next();
        if (opp.equals("&")) {

            System.out.println("A\t\tB\t\tA&&B");
            System.out.println("true\ttrue\ttrue");
            System.out.println("true\tfalse\tfalse");
            System.out.println("false\ttrue\tfalse");
            System.out.println("false\tfalse\tfalse");

        }
        else if (opp.equals("|")) {

            System.out.println("A\t\tB\t\tA||B");
            System.out.println("true\ttrue\ttrue");
            System.out.println("true\tfalse\ttrue");
            System.out.println("false\ttrue\ttrue");
            System.out.println("false\tfalse\tfalse");

        }
        else {

            System.out.println("invalid input");

        }*/
    }
}
