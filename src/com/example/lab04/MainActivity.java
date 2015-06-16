package com.example.lab04;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	/* 
	 * 
	 * @author Eduardo Luiz Arthur Marques - 12296045
	 * 
	 *
	 */

	
	private Button botaoOK;
	private Button botaoLimpar;
	private EditText acessoEditText;
	private EditText senhaEditText;
	private TextView resultadoAcessoTextView;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		acessoEditText = (EditText) findViewById(R.id.acessoEditText);
		senhaEditText = (EditText) findViewById(R.id.senhaEditText);
		resultadoAcessoTextView = (TextView) findViewById(R.id.resultadoTextView);
		
		botaoOK = (Button) findViewById(R.id.acessoButton);
		botaoOK.setOnClickListener(new OnClickListener(){
			
			@Override
			public void onClick(View v){
				
				okButtonAction();
			}

			private void okButtonAction() {
				String acessoInserido = acessoEditText.getText().toString();
				String senhaInserida = senhaEditText.getText().toString();
				
				if(acessoInserido.equals("eduardo") && senhaInserida.equals("123456")){
					resultadoAcessoTextView.setText("Acesso OK!");
				} else {
					resultadoAcessoTextView.setText("Acesso negado!");
				}
			}
		});
		
		botaoLimpar = (Button) findViewById(R.id.limparButton);
		botaoLimpar.setOnClickListener(new OnClickListener(){
			
			@Override
			public void onClick(View v){
				limparButtonAction();
			}

			private void limparButtonAction() {
				acessoEditText.setText(null);
				senhaEditText.setText(null);
				resultadoAcessoTextView.setText(null);
			}
			
		});
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
