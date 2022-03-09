package com.class21.SuperKeyword;

public class userClass {
    /*Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
     Create a subclass  userInfo that will have user address variable and it also being initialized through
     constructor call. Print users name, mobile number and address in userDetails method. Test your code.
     */

    String name;
    String phoneNr;

    public userClass(String name, String phoneNr) {
        this.name = name;
        this.phoneNr = phoneNr;
    }

        }
        class userInfo extends userClass {
            String address;

            public userInfo(String name, String phoneNr, String address) {
                super(name, phoneNr);
                this.address = address;
            }

            void printInfo() {
                System.out.println("user name - " + name);
                System.out.println("user phone number: " + phoneNr);
                System.out.println("user address - " + address);
            }

                }

                class Tester2 {
                    public static void main(String[] args) {
                        userInfo userinfo = new userInfo("Dana", "9293478489", "389 Park Ave, NY, NY");
                        userinfo.printInfo();
                    }

                }





