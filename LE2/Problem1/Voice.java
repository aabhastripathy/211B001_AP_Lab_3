class Voice{
    Animal [] animal = new Animal[5];
    void prepareVoice(){
        animal[0]=new cow();
        animal[1]=new dog();
        animal[2]=new pig();
        animal[3]=new goat();
        animal[4]=new lion();
    }
    void hear(){
        for(int i=0;i<5;i++)
            animal[i].makeVoice();
    }
}