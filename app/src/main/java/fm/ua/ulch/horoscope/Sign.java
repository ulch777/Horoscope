package fm.ua.ulch.horoscope;

/**
 * Created by Admin on 10-Apr-16.
 */
class Sign {
    int getSign(int day, int month){
        int sign = 0;
        switch (month) {
            case (0):
                if (day <= 20) {
                    sign = 0;
                } else {
                    sign = 1;
                }
                break;
            case (1):
                if (day <= 19) {
                    sign = 1;
                } else {
                    sign = 2;
                }
                break;
            case (2):
                if (day <= 20) {
                    sign = 2;
                } else {
                    sign = 3;
                }
                break;
            case (3):
                if (day <= 20) {
                    sign = 3;
                } else {
                    sign = 4;
                }
                break;
            case (4):
                if (day <= 21) {
                    sign = 4;
                } else {
                    sign = 5;
                }
                break;
            case (5):
                if (day <= 21) {
                    sign = 5;
                } else {
                    sign = 6;
                }
                break;
            case (6):
                if (day <= 22) {
                    sign = 6;
                } else {
                    sign = 7;
                }
                break;
            case (7):
                if (day <= 23) {
                    sign = 7;
                } else {
                    sign = 8;
                }
                break;
            case (8):
                if (day <= 22) {
                    sign = 8;
                } else {
                    sign = 9;
                }
                break;
            case (9):
                if (day <= 22) {
                    sign = 9;
                } else {
                    sign = 10;
                }
                break;
            case (10):
                if (day <= 21) {
                    sign = 10;
                } else {
                    sign = 11;
                }
                break;
            case (11):
                if (day <= 21) {
                    sign = 11;
                } else {
                    sign = 0;
                }
                break;
        }
        return sign;
    }
}
