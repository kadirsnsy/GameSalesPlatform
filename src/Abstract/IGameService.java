package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public interface IGameService { 
	void add(Game game);
	void update(Game game);
	void delete(Game game);
	void Sell(Game game, Player player, Campaign compaing);
}
