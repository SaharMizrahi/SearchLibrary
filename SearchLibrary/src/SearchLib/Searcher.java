package SearchLib;
/**
 * 
 * @author Sahar Mizrahi and Gal Ezra
 *
 * @param <T>
 */
public interface Searcher<T>
{
	public Solution search(Searchable<T> searchable);
	public int getNumberOfNodesEvaluated();

}
