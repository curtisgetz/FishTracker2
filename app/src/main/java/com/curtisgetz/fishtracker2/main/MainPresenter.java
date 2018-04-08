package com.curtisgetz.fishtracker2.main;

/**
 * Responsible for handling actions from the View and updating the UI as required.
 */

public class MainPresenter implements MainContract.Presenter{


    private MainContract.MvpView mView;

    MainPresenter(MainContract.MvpView view){
        mView = view;
    }



}
