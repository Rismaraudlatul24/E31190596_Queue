/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author Risma Aulia
 */
public class Queue {
    //mengidentifikasi variabel
    int queue[]=new int [5];
    //untuk menentukan ukuran
    int size;
    int front;
    int rear;
    
    //Buat method untuk menampilkan
    public void enQueue (int data){
        //Kondisi dimana pada saat di cek jika sudah penuh 
        if (!isFull()){
            //menambahkan item pada rear
            queue [rear]=data;
            //menentukan akhiran array agar bisa berubah
            rear=(rear + 1)%5;
            //menetukan ukuran array
            size=size+1;
        }
        //kondisi dimana if tidak terpenuhi
        else
        {
            //menampilkan hasil output
            System.out.println("Queue is Full");
        }
    }
    
    //Buat method untuk menampilkan
    public int deQueue(){
        //menentukan isi array
        int data=queue[front];
        //Kondisi dimana pada saat di cek jika sudah kosong
        if (!isEmpty()){
            //menentukan posisi awal dari array
            front=(front+1)%5;
            //menentukan ukuran array
            size=size+1;
        }
        //kondisi dimana if tidak terpenuhi
        else
        {
            //menampilkan hasil output
            System.out.println("Queue is Empty");
        }
        
        //mengembalikan nilai data itu sendiri
        return data;
    }
    
    //Buat method untuk menampilkan
    public void show(){
        //menampilkan data
        System.out.print("Data Queue");
        //membuat perulangan untuk menampilkan nilai array
        for (int i = 0; i < size; i++) {
            //menampilkan data
            System.out.print(queue[(front+i)%5]+" ");
            
        }
        //menampilkan hasil output
        System.out.println("");
        //menampilkan hasil output
        System.out.println("Data sebelumnya : ");
        
        for (int n : queue){
            //menampilkan data
            System.out.print(n+" ");
        }
    }
    
    //untuk mengembalikan nilai dari size
    public int getSize(){
        return size;
    }
    
    //Buat method untuk mengecek apakah nilainya kosong
    public boolean isEmpty(){
        return getSize()==0;
    }
    
    //Buat method untuk mengecek apakah nilainya penuh
    public boolean isFull(){
        return getSize()==5;
    }
}
