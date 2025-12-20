#include<iostream>
using namespace std;
void changeA(int s){
    s=30;
    cout << s << "\n";
}
void changeA2(int *ptr){
    *ptr=30;
    cout << *ptr << "\n";
}
void changeA3(int &a){
    a=30;
    cout << a << "\n";
}
void matrixPointer(){
    int arr[4][4] = {
                         {1, 2, 3, 4},
                            {5, 6, 7, 8},
                                {9, 10, 11, 12},
                                             {13, 14, 15, 16}
                        };

    cout<<arr<<"\n";
    cout<<arr+1<<"\n";
    cout<<arr+2<<"\n";
    cout<<arr+3<<"\n";

}

int main(){
    // int a=10;
    // int *ptr=&a;
    // int **ptr2=&ptr;
    // cout << ptr << "\n";
    // cout <<"Hello" << "\n";
    // cout << &ptr << "\n";
    // cout << *ptr2 << "\n";
    // *ptr=90;
    // cout << a << "\n";
    // int *ptr3=NULL;
    // cout << ptr3 << "\n";
    //call by value
    // int s=10;
    // changeA(s);
    // cout << s << "\n";
    //call by reference using pointer 
    // int t=20;
    // changeA2(&t);
    // cout << t << "\n";
    // call by reference variables
    // int a=10;
    // changeA3(a);
    // cout << a << "\n";
    // return 0;
    // int x=20;
    // int *ptr=&x;
    // cout << ptr << "\n";
    // ptr++;
    // cout << ptr << "\n";

    // char a='m';
    // char *ptr1=&a;
    // cout << ptr1 << "\n";
    // ptr1++;
    // cout << ptr1<< "\n";

    matrixPointer();

}