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
#define TESTING_FILE_IN
//#define TESTING_FILE_OUT
#define DEBUG
//#define SHOW_TIMING

void leadGame(int scores[10001], int &n) {
    #ifdef DEBUG
    cout << "NEW TEST: n= " << n << endl;
    #endif
    int p1Score, p2Score, p1, p2;

    for (int i = 0; i < n * 2; i += 2) {

        p1Score += scores[i];
        p2Score += scores[i + 1];

        if (p1Score > p2Score) {
            if (p1Score - p2Score > p1) {
                p1 = p1Score - p2Score;
                #ifdef DEBUG
                cout << "Player 1 changed: " << p1 << endl;
                #endif
            }
        } else {
            if (p2Score - p1Score > p2) {
                p2 = p2Score - p1Score;
                #ifdef DEBUG
                cout << "Player 2 changed: " << p2 << endl;
                #endif
            }
        }
        #ifdef DEBUG
        cout << p1Score << " " << p2Score << " ";

        if (p1Score > p2Score)
            cout << "Player 1" << " " << p1Score - p2Score << endl;
        else
            cout << "Player 2" << " " << p2Score - p1Score << endl;
        #endif
    }

    if (p1 > p2) {
        cout << "1" << " " << p1;
    } else {
        cout << "2" << " " << p2;
    }
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

    int scores[10001], n;

    scanf("%d", &n);

    for (int i = 0; i < n * 2; i += 2) {
        scanf("%d", &scores[i]);
        scanf("%d", &scores[i + 1]);
    }

    leadGame(scores, n);

    #ifdef SHOW_TIMING
    t2 = clock(); //End measuring running time.
    float diff = ((float) t2 - (float) t1) / 1000000.0F;
    cout << "RUNNING TIME: " << diff << endl;
    #endif

    return 0;
}