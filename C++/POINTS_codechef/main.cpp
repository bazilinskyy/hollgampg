/* 
 * File:   main.cpp
 * Author: Pavlo Bazilinskyy aka Hollgam
 *
 * Created on July 11, 2011
 */

#include <stdio.h>
#include <iostream>
#include <iomanip>
#include <math.h>

using namespace std;

#define TESTING_FILE_IN
//#define TESTING_FILE_OUT
//#define DEBUG
//#define SHOW_TIMING

typedef struct point {
    int x, y;
} Point;

Point points[100001];

int compare(const void* p1, const void* p2) {
    Point *a = (Point*) p1;
    Point *b = (Point*) p2;
    if (a->x < b->x) return -1;
    else if (a->x > b->x) return 1;
    else {
        if (a->y > b->y) return -1;
        else return 1;
    }
}

double calculateRouteLen(Point points[100001], int &n) {
    //Sort matrix: x ascending; y descending
    qsort(points, n, sizeof (Point), compare);

    #ifdef DEBUG
    cout << "sorted: " << endl;
    for (int j = 0; j < n; j++) {
        cout << points[j].x << ";" << points[j].y << endl;
    }
    cout << endl;
    #endif

    //Calculate the distance
    double dist = 0.0;
    for (long j = 0; j < n; j++) {
        if (j != n - 1)
            dist += sqrt(pow(points[j + 1].x - points[j].x, 2) + pow(points[j + 1].y - points[j].y, 2));
    }
    #ifdef DEBUG
    cout << endl;
    #endif
    return dist;
}

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

        for (long j = 0; j < n; j++) {
            scanf("%d", &points[j].x);
            scanf("%d", &points[j].y);
        }

        cout << fixed << setprecision(2) << calculateRouteLen(points, n) << endl;

        #ifdef DEBUG
        cout << endl;
        #endif

    }


    #ifdef SHOW_TIMING
    t2 = clock(); //End measuring running time.
    float diff = ((float) t2 - (float) t1) / 1000000.0F;
    cout << "RUNNING TIME: " << diff << endl;
    #endif

    return 0;
}