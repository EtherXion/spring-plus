package org.example.expert.domain.todo.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.example.expert.domain.todo.entity.Todo;
import org.example.expert.domain.todo.entity.QTodo;
import org.example.expert.domain.user.entity.QUser;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import static org.example.expert.domain.todo.entity.QTodo.*;

import java.util.Optional;

@RequiredArgsConstructor
public class TodoQueryRepositoryImpl implements TodoQueryRepository {

    private final JPAQueryFactory jpaQueryFactory;

//    // 원본
//    @Query("SELECT t FROM Todo t " +
//            "LEFT JOIN t.user " +
//            "WHERE t.id = :todoId")
//    Optional<Todo> findByIdWithUser(@Param("todoId") Long todoId);

    @Override
    public Optional<Todo> findByIdWithUser(Long todoId) {

        QTodo qTodo = QTodo.todo;
        QUser qUser = QUser.user;

        Todo result = jpaQueryFactory
                .selectFrom(qTodo)
                .leftJoin(qTodo.user, qUser).fetchJoin()
                .where(qTodo.id.eq(todoId))
                .fetchOne();

        return Optional.ofNullable(result);
    }

}
