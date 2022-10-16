package kg.nazar.hm33;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<State> states = new ArrayList<State>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // начальная инициализация списка
        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.list);
        // создаем адаптер
        StateAdapter adapter = new StateAdapter(this, states);
        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);
    }
    private void setInitialData(){

        states.add(new State ("Китай", "Пекин", R.drawable.china));
        states.add(new State ("Германия", "Берлин", R.drawable.germany));
        states.add(new State ("Великобритания", "Лондон", R.drawable.england));
        states.add(new State ("Индия", "Дели", R.drawable.india));
        states.add(new State ("США", "Вашингтон", R.drawable.usa));
    }
}