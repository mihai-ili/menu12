package com.example.menu12.ui.worldskills;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.menu12.R;
import com.example.menu12.databinding.FragmentWorldSkillsBinding;
import com.example.menu12.ui.main.MainViewModel;
import com.example.menu12.ui.po.POFragment;
import com.example.menu12.ui.po.POViewModel;

public class WorldSkillsFragment extends Fragment {

    private WorldSkillsViewModel mViewModel;

    public static WorldSkillsFragment newInstance() {
        return new WorldSkillsFragment();
    }


    private FragmentWorldSkillsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        WorldSkillsViewModel homeViewModel =
                new ViewModelProvider(this).get(WorldSkillsViewModel.class);

        binding = FragmentWorldSkillsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


    //    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
//                             @Nullable Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_world_skills, container, false);
//    }
//
//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//        mViewModel = new ViewModelProvider(this).get(WorldSkillsViewModel.class);
//        // TODO: Use the ViewModel
//    }

}