package academy.devdojo.springboot2essentials.repository;

import academy.devdojo.springboot2essentials.domain.Anime;

import java.util.List;

public interface IAnimeRepository {
    List<Anime> listAll();
}
