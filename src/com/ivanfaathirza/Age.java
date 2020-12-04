package com.ivanfaathirza;

public class Age {
    private int yearBirth, yearNow;
    private static String red = "\033[38;2;255;0;0m";

    public Age(int yearNow){
        this.yearNow = yearNow + 1900;
    }

    public int getYearNow() {
        return yearNow;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int hitungUmur(){
        return yearNow - yearBirth;
    }

    public String tandanyaKamu(int umur){
        String tandanyaKamu = "";
        if(0 <= umur && umur <= 5) {
            tandanyaKamu = red+"LAGI LUCU-LUCU NYA";
        }else if(5 < umur && umur <= 10){
            tandanyaKamu = red+"MASIH ANAK-ANAK";
        }else if(10 < umur && umur <= 13){
            tandanyaKamu = red+"MASIH REMADJA";
        }else if(13 < umur && umur <= 19){
            tandanyaKamu = red+"ALAY";
        }else if(19 < umur && umur <= 29){
            tandanyaKamu =  red+"LAGI GALAU NYARI JODOH";
        }else if(29 < umur && umur <= 35){
            tandanyaKamu = red+"LAGI SIBUK NYARI UANG";
        }else if(35 < umur && umur <= 150){
            tandanyaKamu = red+"SUDAH TUA";
        }else if(0 > umur && umur > 150) {
            tandanyaKamu = red+"TIDAK TERDETEKSI KEHIDUPAN";
        }
        return tandanyaKamu;
    }
}
