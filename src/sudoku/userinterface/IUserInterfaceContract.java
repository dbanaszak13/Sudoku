package sudoku.userinterface;

public interface IUserInterfaceContract {
    interface EventListener{
        void onSodokuInput(int x, int y, int input);
        void onDialogClick();
    }

    interface View {
        void setListener(IUserInterfaceContract.EventListener listener);
        void updateSquare(int x, int y, int input);
        void updateBoard(SodokuGame game);
        void showDialog(String message);
        void showError(String message);

    }
}
