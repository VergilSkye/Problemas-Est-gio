#include <iostream>
using namespace std;

int N, F;
int C[1000005];

int dinheiro(int x){
    int total = 0;

    for(int i = 0; i < N; i++){
        total += x/C[i];
    }

    return total;
}

int main(){
    cin >> N >> F;
    for(int i = 0; i < N; i++){
        cin >> C[i];
    }
    //definir intervalo da resposta
    int e=1, d=100000000, m;
    //busca
    while( e < d ){
        m = (e+d)/2;
        if( dinheiro(m) >= F ){
            d = m;
        }else{
            e = m+1;
        }
    }

    cout << e << endl;

}
