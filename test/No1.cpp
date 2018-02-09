#include <iostream>
#include <math.h>
using namespace std;

int main()
{
    long a[30];
    long b[30];
        a[1]=1;
        b[1]=4;
    int N;
    cout << "Nを入力してください--->"<<endl;
    cin >> N;
    int i;
    for (i=2;i< N+1;i++)
    {   b[i]=pow(4,i);
        a[i]=4*a[i-1]+b[i-1];
    }
    cout << a[N]<<endl;
    return 0;
}
