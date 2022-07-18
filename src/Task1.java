import java.util.Random;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Task1 {
    public static void main(String[] args) {
        Random rm = new Random();
        Scanner sn = new Scanner(System.in);


        System.out.println("Vvedite chislo: ");
        String n = " Years ";
        int m = 0;
        int a = sn.nextInt();
        if (a > 365) {
            while (a > 365) {
                a -= 365;
                m += 1;
            }
            if (a <= 31) {
                System.out.println(m + n + a + " Yanvarya");
            } else if (a > 31) {
                int ab = a - 31;
                if (ab > 28) {
                    int abc = ab - 28;
                    if (abc > 31) {
                        int ac = abc - 31;
                        if (ac > 30) {
                            int bc = ac - 30;
                            if (bc > 31) {
                                int ba = bc - 31;
                                if (ba > 30) {
                                    int ca = ba - 30;
                                    if (ca > 31) {
                                        int bca = ca - 31;
                                        if (bca > 30) {
                                            int acb = bca - 30;
                                            if (acb > 31) {
                                                int aa = acb - 31;
                                                if (aa > 30) {
                                                    int b = aa - 30;
                                                    if (b > 31) {
                                                        int c = b - 31;
                                                        if (c > 31) {

                                                        } else {
                                                            System.out.println(m + n + c + " Dekabrya");
                                                        }
                                                    } else {
                                                        System.out.println(m + n + b + " Noyabrya");
                                                    }
                                                } else {
                                                    System.out.println(m + n + aa + " Oktyabrya");
                                                }
                                            } else {
                                                System.out.println(m + n + acb + " Sentyabrya");
                                            }
                                        } else {
                                            System.out.println(m + n + bca + " Avgusta");
                                        }
                                    } else {
                                        System.out.println(m + n + ca + " Iulya");
                                    }
                                } else {
                                    System.out.println(m + n + bc + " Iunya");
                                }
                            } else {
                                System.out.println(m + n + bc + " Maya");
                            }
                        } else {
                            System.out.println(m + n + ac + " Aprelya");
                        }
                    } else {
                        System.out.println(m + n + abc + " Marta");
                    }
                } else {
                    System.out.println(m + n + ab + " Fevralya");
                }
            } else {
                if (a <= 31) {
                    System.out.println(m + n + a + " Yanvarya");
                } else if (a > 31) {
                    int ab = a - 31;
                    if (ab > 28) {
                        int abc = ab - 28;
                        if (abc > 31) {
                            int ac = abc - 31;
                            if (ac > 30) {
                                int bc = ac - 30;
                                if (bc > 31) {
                                    int ba = bc - 31;
                                    if (ba > 30) {
                                        int ca = ba - 30;
                                        if (ca > 31) {
                                            int bca = ca - 31;
                                            if (bca > 30) {
                                                int acb = bca - 30;
                                                if (acb > 31) {
                                                    int aa = acb - 31;
                                                    if (aa > 30) {
                                                        int b = aa - 30;
                                                        if (b > 31) {
                                                            int c = b - 31;
                                                            if (c > 31) {

                                                            } else {
                                                                System.out.println(m + n + c + " Dekabrya");
                                                            }
                                                        } else {
                                                            System.out.println(m + n + b + " Noyabrya");
                                                        }
                                                    } else {
                                                        System.out.println(m + n + aa + " Oktyabrya");
                                                    }
                                                } else {
                                                    System.out.println(m + n + acb + " Sentyabrya");
                                                }
                                            } else {
                                                System.out.println(m + n + bca + " Avgusta");
                                            }
                                        } else {
                                            System.out.println(m + n + ca + " Iulya");
                                        }
                                    } else {
                                        System.out.println(m + n + bc + " Iunya");
                                    }
                                } else {
                                    System.out.println(m + n + bc + " Maya");
                                }
                            } else {
                                System.out.println(m + n + ac + " Aprelya");
                            }
                        } else {
                            System.out.println(m + n + abc + " Marta");
                        }
                    } else {
                        System.out.println(m + n + ab + " Fevralya");
                    }
                }
            }
        }
    }
}