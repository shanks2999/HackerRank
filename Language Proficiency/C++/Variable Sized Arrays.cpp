/**
Link to Original Problem:
    https://www.hackerrank.com/challenges/cpp-hello-world/problem
**/


#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int n,q;
    cin>>n>>q;
    vector<vector<int>> vec;
    for(int i=0;i<n;i++)
    {
        int size;
        cin>>size;
        vector<int> arr;
        for(int j=0;j<size;j++)
        {
            int temp;
            cin>>temp;
            arr.push_back(temp);
        }
        vec.push_back(arr);
    }
    for(int i=0;i<q;i++)
    {
        int row, col;
        cin>>row>>col;
        cout<<vec[row][col]<<endl;
    }
    return 0;
}