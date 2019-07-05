package br.com.blsoft.notificacaocomalarme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class AlarmReceiver extends BroadcastReceiver {

    private final String TAG = getClass().getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "EXECUTANDO TAREFA");
        Toast.makeText(context, "EXECUTANDO TAREFA!!!", Toast.LENGTH_SHORT).show();

        BLNotificacao blNotificacao = new BLNotificacao(context);
        blNotificacao.criarNotificacao(context, "NOTIFICAÇÃO!", "Esta é uma notificação do AlarmManager");

    }
}
