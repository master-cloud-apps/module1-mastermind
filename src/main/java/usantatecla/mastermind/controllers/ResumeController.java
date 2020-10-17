package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Game;

public class ResumeController extends Controller {

    public ResumeController(Game game) {
        super(game);
    }

    public void resume() {
        this.game.clear();
    }

}
