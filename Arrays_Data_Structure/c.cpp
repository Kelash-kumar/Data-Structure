#include <iostream>
using namespace std;
int main(){
int number;
    int arr[]={2,3,4,4,55,6,6,7,7,8};
    cout<<"Enter element to search in array ";
    cin>>number;
    for(int i=0;i<10;i++){
        if(arr[i]==number)
            cout<<"your searched element is  at index "<<i;
        cout<<" "<<i;
    }


    return 0;
}