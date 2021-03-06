package VisitorPatterns.Sample8;

/**
 * Created by Indi on 6/23/2016.
 */
public class Pokemon implements PokemonType {
    PokemonType[] pokemonTypes;

    public Pokemon(){
        pokemonTypes = new PokemonType[]{new Bulbasaur()};
    }

    @Override
    public void accept(PokemonVisitor pokemonVisitor) {
        for(int i = 0;i < pokemonTypes.length; i++){
            pokemonTypes[i].accept(pokemonVisitor);
        }

        pokemonVisitor.visit(this);
    }
}
