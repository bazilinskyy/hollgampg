/* 
 * File:   main.cpp
 * Author: Pavlo Bazilinskyy aka Hollgam
 *
 * Created on July 11, 2011
 */

#include <stdio.h>
#include <iostream>

using namespace std;

//#define TESTING_CONSOLE_MANY
//#define TESTING_FILE_IN
//#define TESTING_FILE_OUT
//#define DEBUG
//#define SHOW_TIMING

/*
 * 
 */
int main() {
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

    int n, t;

    scanf("%d", &t);

    for (int i = 0; i < t; i++) {
        scanf("%d", &n);
        #ifdef DEBUG
        cout << n << endl;
        #endif

        ((n % 2) != 0) ? printf("BOB\n") : printf("ALICE\n");
    }


    #ifdef SHOW_TIMING
    t2 = clock(); //End measuring running time.
    float diff = ((float) t2 - (float) t1) / 1000000.0F;
    cout << "RUNNING TIME: " << diff << endl;
    #endif

    return 0;
}