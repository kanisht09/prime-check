#include<iostream>
using namespace std;

int main()
{
    // program to check prime number

    int n;
    cin >> n;

    int flag = 1;

    for (int i = 2; i <= n / 2; i++)
    {
        if (n % i == 0)
        {
            flag = 0;
            break;
        }
    }

    if (flag)
    {
        cout << "IT'S A PRIME";
    }
    else
    {
        cout << "IT'S NOT A PRIME";
    }
}
