/* 
 * File:   main.cpp
 * Author: Pavlo Bazilinskyy aka Hollgam
 *
 * Created on July 8, 2011, 3:02 PM
 */

#include <stdio.h>
#include <iostream>
#include <math.h>
#include <bitset>

using namespace std;

#define TESTING_CONSOLE_MANY
//#define TESTING_FILE_IN
//#define TESTING_FILE_OUT
//#define DEBUG
//#define SHOW_TIMING

bool payUp(int money[21], int& n, int& m) {
    #ifdef DEBUG
    cout << "NEW TEST: n= " << n << " m= " << m << endl;
    #endif
    int i, j, sum;

    for (i = 1; i < pow(2, n); i++) {
        sum = 0;
        bitset < 20 > binI = i;
        string binStr; //convert bitset into string and crop not needed zeros, dynamic bitset
        binStr = binI.to_string<char, char_traits<char>, allocator<char> >();
        binStr.erase(0, 20 - n);
        #ifdef DEBUG
        cout << "STR: " << binStr << endl;
        #endif
        for (j = 0; j < n; j++) {
            if (binStr[j] == '1') {
                sum += money[j];
            }
        }
        #ifdef DEBUG
        cout << "SUM:" << sum << endl;
        #endif
        if (sum == m) {
            return true;
        }

    }

    return false;
}

/*
 * 
 */
int main(int argc, char** argv) {
    #ifdef SHOW_TIMING
    clock_t t1, t2; //Used for testing running time.
    t1 = clock(); //Start measuring running time.
    #endif

    #ifdef TESTING_FILE_IN
    freopen("in.txt", "r", stdin);
    #endif
    
    #ifdef TESTING_FILE_OUT
    freopen("out.txt", "w", stdout);
    #endif
    
    int t;

    #ifdef TESTING_CONSOLE_MANY
    scanf("%d", &t);
    #else
    t = 1;
    #endif

    int n, m , i;
    
    while (t--) {
        scanf("%d", &n);
        scanf("%d", &m);
        int money[21];
        for (i = 0; i < n; i++) {
            scanf("%d", &money[i]);
        }

        if (payUp(money, n, m))
            cout << "Yes" << endl;
        else
            cout << "No" << endl;
    }

    #ifdef SHOW_TIMING
    t2 = clock(); //End measuring running time.
    float diff = ((float) t2 - (float) t1) / 1000000.0F;
    cout << "RUNNING TIME: " << diff << endl;
    #endif

    return 0;
}