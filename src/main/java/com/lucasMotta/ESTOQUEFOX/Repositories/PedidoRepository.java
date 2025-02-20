package com.lucasMotta.ESTOQUEFOX.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucasMotta.ESTOQUEFOX.models.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
