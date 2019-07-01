package edu.cnm.deepdive.diceware.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ResourceBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ResourceBundelProvider implements WordProvider {

  private ResourceBundle bundle;

  @Autowired
  public ResourceBundelProvider(ResourceBundle bundle) {
    this.bundle = bundle;
  }


  @Override
  public Collection<String> words() {
    List<String> words = new ArrayList<>();
    for (String key : bundle.keySet()) {
      words.add(bundle.getString(key));
    }
    return words;
  }



}
