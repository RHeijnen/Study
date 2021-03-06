package VisitorPatterns.Sample14;

/**
 * Created by Indi on 6/24/2016.
 */
public class Pokemon implements PokemonType {
    PokemonType[] types;

    public Pokemon(){
        types = new PokemonType[]{new Bulbasaur()};
    }

    @Override
    public void accept(PokemonVisitor pokemonVisitor) {
        for(int i = 0; i < types.length;i++){
            types[i].accept(pokemonVisitor);
        }
        pokemonVisitor.visit(this);
    }
}
