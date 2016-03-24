package com.dentonlee24.funfacts;

import java.util.Random;

public class FactBook {
    //Fields are the properties of the objects
    private String[] mFacts = {
            "\"Facebook Addiction Disorder\" is a mental disorder identified by Psychologists.",
            "Banging your head against a wall burns 150 calories an hour.",
            "When hippos are upset, their sweat turns red.",
            "29th May is officially \"Put a Pillow on Your Fridge Day\".",
            "During your lifetime, you will produce enough saliva to fill two swimming pools.",
            "Polar bears can eat as many as 86 penguins in a single sitting.",
            "You can born with about 300 bones; and by the time you are an adult you will have 206 left.",
            "Shark teeth are coated with fluoride which acts like toothpaste to keep the shark's mouth healthy and clean.",
            "If you yelled for 8 years, 7 months and 6 days, you would have produced enough sound energy to heat one cup of coffee.",
            "A giraffe can clean its ears with its 21-inch tongue!",
            "The longest time between two twins being born is 87 days!",
            "Everyone has a unique tongue print, just like fingerprint.",
            "A crocodile can't poke its tongue out :p",
            "An apple, potato, and onion all taste the same if you eat them with your nose plugged.",
            "Over 1000 birds a year die from smashing into windows.",
            "Ants stretch when they wake up in the morning."
    };

    //Methods are the actions the object can take
    public String getFact() {
        String fact = "";
        //Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        fact = mFacts[randomNumber];

        return fact;
    }

}
