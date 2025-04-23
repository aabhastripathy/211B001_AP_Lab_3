class Voice{
    void prepareVoice(){
        Animal [] animal = new Animal[5];
        animal[0]=new cow();
        animal[1]=new dog();
        animal[2]=new pig();
        animal[3]=new goat();
        animal[4]=new lion();
        hear(animal);
    }
    void hear(Animal [] animal){
        for(int i=0;i<5;i++)
            animal[i].makeVoice();
    }
}