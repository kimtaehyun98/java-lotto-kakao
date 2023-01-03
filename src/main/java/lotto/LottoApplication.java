package lotto;

import lotto.controller.LottoController;
import lotto.domain.LottoTicket;
import lotto.domain.LottoWinnerTicket;
import lotto.service.LottoCalculator;
import lotto.utils.ChangeInput;
import lotto.view.InputView;
import lotto.view.ResultView;

import java.util.ArrayList;

public class LottoApplication {

    public static void main(String[] args) {
        InputView inputView = new InputView();
        int amount = inputView.inputUserAmount();

        // 로또 구매
        LottoController lottoController = new LottoController(amount);

        // 구입한 로또 번호들 출력
        ResultView resultView = new ResultView();
        resultView.printLottoTickets(lottoController.getLottoTickets());

        // 지난주 당첨 번호 및 보너스볼 입력
        ChangeInput changeInput = new ChangeInput();

        // 보너스볼 입력
        LottoWinnerTicket lottoWinnerTicket = changeInput.changeToWinnerTicket(
                inputView.inputWinNumber(),
                inputView.inputBonusNumber());

        LottoCalculator lottoCalculator = new LottoCalculator(lottoWinnerTicket);

        // Winner 뽑아내기
        ArrayList<Integer> result = lottoCalculator.getResult(lottoController.getLottoTickets());

        // 당첨 통계 출력
        resultView.printWinningStatics(result);
    }
}
