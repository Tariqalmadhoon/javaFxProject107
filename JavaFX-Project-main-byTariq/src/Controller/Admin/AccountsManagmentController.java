/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Admin;

import Model.Account;
import Model.Accounts;
import Model.User;
import View.ViewManager;
import java.net.URL;
import java.sql.SQLException;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Yahya
 */
public class AccountsManagmentController implements Initializable {
    
   public static Accounts selectedAccountsToUpdate;
   public static Stage updateStage;

    @FXML
    private Button usersManagmentPageBtn;
    @FXML
    private Button accountsPageBtn;
    @FXML
    private Button operationsPageBtn;
    @FXML
    private Button createNewAccountrBtn;
    @FXML
    private Button showAllAccountsBtn;
    @FXML
    private Button updateSelectedAccountBtn;
    @FXML
    private Button deleteSelectedAccountBtn;
    @FXML
    private Button searchAccountBtn;
    @FXML
    private TextField accontSearchTF;
    @FXML
    private TableView<Accounts> usersTableView;
    @FXML
    private TableColumn<Accounts, Integer> idACol;
    @FXML
    private TableColumn<Accounts, Integer> accountNumberCol;
    @FXML
    private TableColumn<Accounts, String> userNameCol;
    @FXML
    private TableColumn<Accounts, String> currencyCol;
    @FXML
    private TableColumn<Accounts, Double> balanceCol;
    @FXML
    private TableColumn<Accounts, Date> creationDateCol;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        idACol.setCellValueFactory(new PropertyValueFactory("id"));
        accountNumberCol.setCellValueFactory(new PropertyValueFactory("account_number "));
        userNameCol.setCellValueFactory(new PropertyValueFactory("username"));
        currencyCol.setCellValueFactory(new PropertyValueFactory("currency	"));
        balanceCol.setCellValueFactory(new PropertyValueFactory("balance"));
        creationDateCol.setCellValueFactory(new PropertyValueFactory("creation_date"));
    }    

    @FXML
    private void showUsersManagmentPage(ActionEvent event) {
         ViewManager.adminPage.changeSceneToUsersManagment();
    }

    @FXML
    private void showAccountsPage(ActionEvent event) {
    }

    @FXML
    private void showOperationsPage(ActionEvent event) {
    }

    @FXML
    private void showAccountCreationPage(ActionEvent event) {
   
         ViewManager.adminPage.changeSceneToCreateUser();

        
    }

    @FXML
    private void showAllAccounts(ActionEvent event) throws SQLException, ClassNotFoundException  {
       ObservableList<Accounts> accountList =
       FXCollections.observableArrayList();
      
      usersTableView.setItems(accountList); 
    }
    

    @FXML
    private void updateSelectedAccount(ActionEvent event) {
    }

    @FXML
    private void deleteSelectedAccount(ActionEvent event) {
    }

    @FXML
    private void searchForAnAccount(ActionEvent event) {
    }
    
    
    
}
