package VisitorPatterns.Sample11;

/**
 * Created by Indi on 6/23/2016.
 */
public interface PokemonType {
    public void accept(PokemonVisitor pokemonVisitor);
}
