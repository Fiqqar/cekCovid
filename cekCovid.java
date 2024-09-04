package latihan.pkg10.pplg.pkg2.cekCovid;

import java.util.Scanner;

public class cekCovid {
    public static void main(String[] args) {
        System.out.println("============ Cek Covid ============");
        System.out.println("Aplikasi cek covid untuk masyarakat");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // Penanganan jika thread diinterupsi 
        }

        Scanner scan = new Scanner(System.in);
        String nama = "";

        System.out.print("Siapa nama anda? : ");
        nama = scan.nextLine();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // Penanganan jika thread diinterupsi 
        }

        System.out.println("Halo " + nama + "! Selamat datang di aplikasi cek covid!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // Penanganan jika thread diinterupsi 
        }

        System.out.println("Kita akan menanyakan beberapa pertanyaan untuk mengecek apakah kamu positif covid atau negatif.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // Penanganan jika thread diinterupsi 
        }

        System.out.println("APLIKASI INI BISA ADA KESALAHAN. JANGAN JADIKAN APLIKASI INI SEBAGAI PATOKAN KAMU POSITIF COVID ATAU TIDAK.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // Penanganan jika thread diinterupsi 
        }

        System.out.println("JIKA KEBANYAKAN PERTANYAAN YANG KAMU JAWAB MERUJUK KE ARAH GEJALA COVID, SEGERALAH KE RUMAH SAKIT TERDEKAT UNTUK MELAKUKAN SWAB TEST.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // Penanganan jika thread diinterupsi 
        }

        System.out.println("Saatnya Pertanyaan Pertama.");
        String jawaban1 = "";

        System.out.println("Apakah kamu merasa makanan mu hambar belakangan ini? (jawab 1 atau 2): ");
        System.out.println("1 (IYA)");
        System.out.println("2 (TIDAK)");
        jawaban1 = scan.nextLine();

        switch (jawaban1) {
            case "1":
                System.out.println("Baik, Pertanyaan Kedua");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    // Penanganan jika thread diinterupsi 
                }

                String jawaban2 = "";
                System.out.println("Apakah kamu belakangan ini merasa sulit bernafas? (jawab 1 atau 2) : ");
                System.out.println("1 (IYA)");
                System.out.println("2 (TIDAK)");
                jawaban2 = scan.nextLine();

                if (jawaban2.equals("1")) {
                    System.out.println("Baik, Pertanyaan Terakhir");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException eas) {
                        // Penanganan jika thread diinterupsi 
                    }

                    String jawaban3 = "";
                    System.out.println("Apakah kamu belakangan ini tidak bisa mencium bau makanan atau barang? (jawab 1 atau 2) : ");
                    System.out.println("1 (IYA)");
                    System.out.println("2 (TIDAK)");
                    jawaban3 = scan.nextLine();
                    
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException easas) {
                        // Penanganan jika thread diinterupsi 
                    }

                    System.out.println("Baik, kami akan melakukan pengecekan terlebih dahulu"); 
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException easasas) {
                        // Penanganan jika thread diinterupsi 
                    }

                    if (jawaban1.equals("1") && jawaban2.equals("1") && jawaban3.equals("1")) {
                        System.out.println("KAMU POSITIF COVID");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException easasas) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("SILAHKAN PERGI KE RUMAH SAKIT TERDEKAT UNTUK MELAKUKAN TEST SWAB/ANTIGEN.");
                    }
                    if (jawaban1.equals("1") && jawaban2.equals("1") && jawaban3.equals("2")) {
                        System.out.println("KAMU POSITIF COVID");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException easasas) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("SILAHKAN PERGI KE RUMAH SAKIT TERDEKAT UNTUK MELAKUKAN TEST SWAB/ANTIGEN.");
                }
                   if (jawaban1.equals("1") && jawaban2.equals("2") && jawaban3.equals("1")) {
                        System.out.println("KAMU POSITIF COVID");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException easasas) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("SILAHKAN PERGI KE RUMAH SAKIT TERDEKAT UNTUK MELAKUKAN TEST SWAB/ANTIGEN."); 
                }
                   if (jawaban1.equals("2") && jawaban2.equals("1") && jawaban3.equals("1")) {
                        System.out.println("KAMU POSITIF COVID");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException easasas) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("SILAHKAN PERGI KE RUMAH SAKIT TERDEKAT UNTUK MELAKUKAN TEST SWAB/ANTIGEN.");    
                }
                   if (jawaban1.equals("1") && jawaban2.equals("2") && jawaban3.equals("2")) {
                        System.out.println("KAMU NEGATIF COVID");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException easasas) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("TETAP DIRUMAH UNTUK MENJAGA KESEHATAN MU.");
                }
                   if (jawaban1.equals("2") && jawaban2.equals("1") && jawaban3.equals("2")) {
                        System.out.println("KAMU NEGATIF COVID");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException easasas) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("TETAP DIRUMAH UNTUK MENJAGA KESEHATAN MU.");
                }
                   if (jawaban1.equals("2") && jawaban2.equals("2") && jawaban3.equals("1")) {
                        System.out.println("KAMU NEGATIF COVID");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException easasas) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("TETAP DIRUMAH UNTUK MENJAGA KESEHATAN MU.");
                }
                   if (jawaban1.equals("2") && jawaban2.equals("2") && jawaban3.equals("2")) {
                        System.out.println("KAMU NEGATIF COVID");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException easasas) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("TETAP DIRUMAH UNTUK MENJAGA KESEHATAN MU.");
                }
                } else {
                    System.out.println("Baik, Pertanyaan Terakhir");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException eas) {
                        // Penanganan jika thread diinterupsi 
                    }

                    String jawaban3 = "";
                    System.out.println("Apakah kamu belakangan ini tidak bisa mencium bau makanan atau barang? (jawab 1 atau 2) : ");
                    System.out.println("1 (IYA)");
                    System.out.println("2 (TIDAK)");
                    jawaban3 = scan.nextLine();
                    
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException easas) {
                        // Penanganan jika thread diinterupsi 
                    }

                    System.out.println("Baik, kami akan melakukan pengecekan terlebih dahulu"); 
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException easasas) {
                        // Penanganan jika thread diinterupsi 
                    }

                    if (jawaban1.equals("1") && jawaban2.equals("1") && jawaban3.equals("1")) {
                        System.out.println("KAMU POSITIF COVID");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException easasas) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("SILAHKAN PERGI KE RUMAH SAKIT TERDEKAT UNTUK MELAKUKAN TEST SWAB/ANTIGEN.");
                    }
                    if (jawaban1.equals("1") && jawaban2.equals("1") && jawaban3.equals("2")) {
                        System.out.println("KAMU POSITIF COVID");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException easasas) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("SILAHKAN PERGI KE RUMAH SAKIT TERDEKAT UNTUK MELAKUKAN TEST SWAB/ANTIGEN.");
                }
                   if (jawaban1.equals("1") && jawaban2.equals("2") && jawaban3.equals("1")) {
                        System.out.println("KAMU POSITIF COVID");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException easasas) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("SILAHKAN PERGI KE RUMAH SAKIT TERDEKAT UNTUK MELAKUKAN TEST SWAB/ANTIGEN."); 
                }
                   if (jawaban1.equals("2") && jawaban2.equals("1") && jawaban3.equals("1")) {
                        System.out.println("KAMU POSITIF COVID");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException easasas) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("SILAHKAN PERGI KE RUMAH SAKIT TERDEKAT UNTUK MELAKUKAN TEST SWAB/ANTIGEN.");    
                }
                   if (jawaban1.equals("1") && jawaban2.equals("2") && jawaban3.equals("2")) {
                        System.out.println("KAMU NEGATIF COVID");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException easasas) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("TETAP DIRUMAH UNTUK MENJAGA KESEHATAN MU.");
                }
                   if (jawaban1.equals("2") && jawaban2.equals("1") && jawaban3.equals("2")) {
                        System.out.println("KAMU NEGATIF COVID");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException easasas) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("TETAP DIRUMAH UNTUK MENJAGA KESEHATAN MU.");
                }
                   if (jawaban1.equals("2") && jawaban2.equals("2") && jawaban3.equals("1")) {
                        System.out.println("KAMU NEGATIF COVID");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException easasas) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("TETAP DIRUMAH UNTUK MENJAGA KESEHATAN MU.");
                }
                   if (jawaban1.equals("2") && jawaban2.equals("2") && jawaban3.equals("2")) {
                        System.out.println("KAMU NEGATIF COVID");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException easasas) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("TETAP DIRUMAH UNTUK MENJAGA KESEHATAN MU.");
                }
                }
                break;
            case "2":
                System.out.println("Baik, Pertanyaan Kedua");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    // Penanganan jika thread diinterupsi 
                }

                String jawaban4 = "";
                System.out.println("Apakah kamu belakangan ini merasa sulit bernafas? (jawab 1 atau 2) : ");
                System.out.println("1 (IYA)");
                System.out.println("2 (TIDAK)");
                jawaban4 = scan.nextLine();

                if (jawaban4.equals("1")) {
                    System.out.println("Baik, Pertanyaan Terakhir");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException eas) {
                        // Penanganan jika thread diinterupsi 
                    }

                    String jawaban5 = "";
                    System.out.println("Apakah kamu belakangan ini tidak bisa mencium bau makanan atau barang? (jawab 1 atau 2) : ");
                    System.out.println("1 (IYA)");
                    System.out.println("2 (TIDAK)");
                    jawaban5 = scan.nextLine();
                    
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException easas) {
                        // Penanganan jika thread diinterupsi 
                    }

                    System.out.println("Baik, kami akan melakukan pengecekan terlebih dahulu"); 
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException easasas) {
                        // Penanganan jika thread diinterupsi 
                    }

                    if (jawaban1.equals("1") && jawaban4.equals("1") && jawaban5.equals("1")) {
                        System.out.println("KAMU POSITIF COVID");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException easasas) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("SILAHKAN PERGI KE RUMAH SAKIT TERDEKAT UNTUK MELAKUKAN TEST SWAB/ANTIGEN.");
                    }
                    if (jawaban1.equals("1") && jawaban4.equals("1") && jawaban5.equals("2")) {
                        System.out.println("KAMU POSITIF COVID");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException easasas) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("SILAHKAN PERGI KE RUMAH SAKIT TERDEKAT UNTUK MELAKUKAN TEST SWAB/ANTIGEN.");
                }
                   if (jawaban1.equals("1") && jawaban4.equals("2") && jawaban5.equals("1")) {
                        System.out.println("KAMU POSITIF COVID");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException easasas) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("SILAHKAN PERGI KE RUMAH SAKIT TERDEKAT UNTUK MELAKUKAN TEST SWAB/ANTIGEN."); 
                }
                   if (jawaban1.equals("2") && jawaban4.equals("1") && jawaban5.equals("1")) {
                        System.out.println("KAMU POSITIF COVID");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException easasas) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("SILAHKAN PERGI KE RUMAH SAKIT TERDEKAT UNTUK MELAKUKAN TEST SWAB/ANTIGEN.");    
                }
                   if (jawaban1.equals("1") && jawaban4.equals("2") && jawaban5.equals("2")) {
                        System.out.println("KAMU NEGATIF COVID");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException easasas) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("TETAP DIRUMAH UNTUK MENJAGA KESEHATAN MU.");
                }
                   if (jawaban1.equals("2") && jawaban4.equals("1") && jawaban5.equals("2")) {
                        System.out.println("KAMU NEGATIF COVID");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException easasas) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("TETAP DIRUMAH UNTUK MENJAGA KESEHATAN MU.");
                }
                   if (jawaban1.equals("2") && jawaban4.equals("2") && jawaban5.equals("1")) {
                        System.out.println("KAMU NEGATIF COVID");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException easasas) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("TETAP DIRUMAH UNTUK MENJAGA KESEHATAN MU.");
                }
                   if (jawaban1.equals("2") && jawaban4.equals("2") && jawaban5.equals("2")) {
                        System.out.println("KAMU NEGATIF COVID");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException easasas) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("TETAP DIRUMAH UNTUK MENJAGA KESEHATAN MU.");
                }
                } else {
                    System.out.println("Baik, Pertanyaan Terakhir");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException eas) {
                        // Penanganan jika thread diinterupsi 
                    }

                    String jawaban5 = "";
                    System.out.println("Apakah kamu belakangan ini tidak bisa mencium bau makanan atau barang? (jawab 1 atau 2) : ");
                    System.out.println("1 (IYA)");
                    System.out.println("2 (TIDAK)");
                    jawaban5 = scan.nextLine();
                    
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException easas) {
                        // Penanganan jika thread diinterupsi 
                    }

                    System.out.println("Baik, kami akan melakukan pengecekan terlebih dahulu"); 
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException easasas) {
                        // Penanganan jika thread diinterupsi 
                    }

                    if (jawaban1.equals("1") && jawaban4.equals("1") && jawaban5.equals("1")) {
                        System.out.println("KAMU POSITIF COVID");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException easasas) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("SILAHKAN PERGI KE RUMAH SAKIT TERDEKAT UNTUK MELAKUKAN TEST SWAB/ANTIGEN.");
                    }
                    if (jawaban1.equals("1") && jawaban4.equals("1") && jawaban5.equals("2")) {
                        System.out.println("KAMU POSITIF COVID");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException easasas) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("SILAHKAN PERGI KE RUMAH SAKIT TERDEKAT UNTUK MELAKUKAN TEST SWAB/ANTIGEN.");
                }
                   if (jawaban1.equals("1") && jawaban4.equals("2") && jawaban5.equals("1")) {
                        System.out.println("KAMU POSITIF COVID");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException easasas) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("SILAHKAN PERGI KE RUMAH SAKIT TERDEKAT UNTUK MELAKUKAN TEST SWAB/ANTIGEN."); 
                }
                   if (jawaban1.equals("2") && jawaban4.equals("1") && jawaban5.equals("1")) {
                        System.out.println("KAMU POSITIF COVID");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException easasas) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("SILAHKAN PERGI KE RUMAH SAKIT TERDEKAT UNTUK MELAKUKAN TEST SWAB/ANTIGEN.");    
                }
                   if (jawaban1.equals("1") && jawaban4.equals("2") && jawaban5.equals("2")) {
                        System.out.println("KAMU NEGATIF COVID");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException easasas) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("TETAP DIRUMAH UNTUK MENJAGA KESEHATAN MU.");
                }
                   if (jawaban1.equals("2") && jawaban4.equals("1") && jawaban5.equals("2")) {
                        System.out.println("KAMU NEGATIF COVID");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException easasas) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("TETAP DIRUMAH UNTUK MENJAGA KESEHATAN MU.");
                }
                   if (jawaban1.equals("2") && jawaban4.equals("2") && jawaban5.equals("1")) {
                        System.out.println("KAMU NEGATIF COVID");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException easasas) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("TETAP DIRUMAH UNTUK MENJAGA KESEHATAN MU.");
                }
                   if (jawaban1.equals("2") && jawaban4.equals("2") && jawaban5.equals("2")) {
                        System.out.println("KAMU NEGATIF COVID");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException easasas) {
                            // Penanganan jika thread diinterupsi 
                        }
                        System.out.println("TETAP DIRUMAH UNTUK MENJAGA KESEHATAN MU.");
                }
        }
    }
}
}
