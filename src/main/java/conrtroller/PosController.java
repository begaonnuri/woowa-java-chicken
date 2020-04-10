package conrtroller;

import static view.InputView.*;
import static view.OutputView.*;

import java.util.List;

import domain.Function;
import domain.Menu;
import domain.MenuRepository;
import domain.Table;
import domain.TableRepository;
import view.InputView;

public class PosController {
	public void run() {
		printMain();
		Function function = Function.of(inputFunctionNumber());

		if (function == Function.ORDER) {
			final List<Table> tables = TableRepository.tables();
			printTables(tables);

			final int tableNumber = InputView.inputTableNumber();

			final List<Menu> menus = MenuRepository.menus();
			printMenus(menus);
		}
	}
}