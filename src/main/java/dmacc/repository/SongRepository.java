/**
 * @author Dylan Thomas - djthomas4
 * CIS175 - Fall 2021
 * Nov 3, 2021
 */

package dmacc.repository;
import dmacc.beans.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SongRepository extends JpaRepository<Song, Long> {

}
