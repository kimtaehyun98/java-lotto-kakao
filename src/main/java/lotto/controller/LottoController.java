package lotto.controller;

import lotto.domain.LottoTickets;

import java.util.ArrayList;

public class LottoController {
    private final LottoTickets lottoTickets;

    public LottoController(int amount) {
        this.lottoTickets = new LottoTickets(amount);
    }

    public int getLottoTicketCount() {
        return lottoTickets.getLottoTicketCount();
    }

    public LottoTickets getLottoTickets(){
        return this.lottoTickets;
    }

    public ArrayList<Integer> getResult() {
    }
}
