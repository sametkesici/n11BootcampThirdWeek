package com.bahadirmemis.springboot.mongodb.convertor;

import java.util.List;

public interface BaseConvertor<T, G> {

  T toEntity(G g);

  G toDto(T t);

  List<T> toEntity(List<G> gList);

  List<G> toDto(List<T> tList);

}
