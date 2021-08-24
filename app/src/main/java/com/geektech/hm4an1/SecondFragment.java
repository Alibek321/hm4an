package com.geektech.hm4an1;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class SecondFragment extends Fragment{


    private RecyclerView recyclerView;
    private SecondFragmentadapter adapter;
    private ArrayList<MusicModel> list = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        adapter = new SecondFragmentadapter();
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recycler_second);


        createList();
        adapter.addList(list);
        setClick();

    }

    private void setClick() {
        adapter.setListiner(new SecondFragmentadapter.Listiner() {
            @Override
            public void onClick(MusicModel model) {
                Intent in = new Intent(requireActivity(),MainActivity2.class);
                in.putExtra("text",model);
                startActivity(in);
            }
        });
    }

    private void createList() {
        list.add(new MusicModel("1", "Птичка", "Hammal and  Naval ", "3:12"));
        list.add(new MusicModel("2", "Богатыми", "Фогель", "3:12"));
        list.add(new MusicModel("3", "Статус Души", "Bakr", "3:00"));
        list.add(new MusicModel("4", "Аристократ", "Моргенштерн", "6:12"));
        list.add(new MusicModel("5", "Нету интереса", "10AGE", "4:02"));
        list.add(new MusicModel("6", "Птрон", "MiyaGI", "1:11"));
        list.add(new MusicModel("7", "Бедный поет", "Bakr", "3:52"));
        list.add(new MusicModel("8", "Не лей", "Bakr", "3:32"));
        list.add(new MusicModel("9", "Франция", "Jamik", "3:45"));
        list.add(new MusicModel("10", "Камри3,5", "UncleFlexxx", "3:33"));
        recyclerView.setAdapter(adapter);
    }
}